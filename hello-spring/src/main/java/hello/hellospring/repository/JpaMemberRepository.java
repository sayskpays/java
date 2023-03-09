package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository{

    /*
    * JPA는 EntityManager로 모든 것을 동작한다. 때문에 Spring에서 EntityManager를 주입 받아야 한다.
    * DB 붙는 DataSource 등도 모두 EntityManager에 포함되어 있다.
    * */
    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id); // Member.class : 조회 대상 지정
        return Optional.ofNullable(member); // member의 값을 Optional로 한번 감쌈
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member as m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny(); // findByName 값 하나만 찾으면 되기 때문에 findAny()
                                        // findAny()는 Optinal로 리턴
    }

    @Override
    public List<Member> findAll() {
        /*
        * JPQL
        * 객체를 대상으로 쿼리를 날림 -> SQL 번역됨
        *  여러 개 리스트를 찾는 것 , PK 기반이 아닌 것들은 JPQL을 작성해야 한다.
        * */
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
