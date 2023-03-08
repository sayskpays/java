package hello.hellospring;

import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.JdbcTemplateMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {


    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {

        return new MemberService(memberRepository()); // MemberService는 생성자에서 MemberRepository가 필요
    }
    @Bean
    public MemberRepository memberRepository() {
        // return new JdbcMemberRepository(dataSource);
       // return new MemoryMemberRepository(); // 인스턴스는 new로 생성 불가. 구현체를 return
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
