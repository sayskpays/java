package hello.hellospring.repository;

import hello.hellospring.domain.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JdbcTemplateMemberRepository implements MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    /* 생성자가 하나이기 때문에 @Autowired 생략.
     스프링에서 DataSource 자동으로 Injection
     */
    public JdbcTemplateMemberRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public MemberDTO save(MemberDTO memberDTO) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        // 테이블명 , PK 값을 활용하여 Insert 문을 생성 한 것 처럼 사용
        jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", memberDTO.getName());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
        memberDTO.setId(key.longValue());
        return memberDTO;
    }

    @Override
    public Optional<MemberDTO> findById(Long id) {
        List<MemberDTO> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(), id);
        return result.stream().findAny();
    }

    @Override
    public Optional<MemberDTO> findByName(String name) {
        List<MemberDTO> result = jdbcTemplate.query("select * from member where name = ?", memberRowMapper(), name);
        return result.stream().findAny();
    }

    @Override
    public List<MemberDTO> findAll() {
        return jdbcTemplate.query("select * from member", memberRowMapper());
    }

    // 쿼리의 결과를 memberRowMapper 에서 매핑!
    // 그 후 결과를 List로 받은 후 Optional로 반환
    private RowMapper<MemberDTO> memberRowMapper() {
        return (rs, rowNum) -> {
            MemberDTO member = new MemberDTO();
            member.setId(rs.getLong("id"));
            member.setName(rs.getString("name"));
            return member;
        };
    }
}
