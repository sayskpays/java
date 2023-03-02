package hello.hellospring.repository;


import hello.hellospring.domain.MemberDTO;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 다른 메서드가 실행 될 때 마다 AfterEach 메서드 실행 ( callBack Method)
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        MemberDTO member = new MemberDTO();
        member.setName("hong");

        repository.save(member);

        // findById의 return값은 Optional , Optional의 값을 가져올때는 get을 붙인다.
        // 즉 Optional 껍질을 벗겨내는 용도 == get()
        MemberDTO result = repository.findById(member.getId()).get();
        // result와 member가 같은지 비교, sout으로 찍지 말고 Assertions 사용
        Assertions.assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        MemberDTO member1 = new MemberDTO();
        member1.setName("hong1");
        repository.save(member1);

        MemberDTO member2 = new MemberDTO();
        member2.setName("hong2");
        repository.save(member2);

        MemberDTO result = repository.findByName("hong1").get();

        Assertions.assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll() {
        MemberDTO member1 = new MemberDTO();
        member1.setName("hong1");
        repository.save(member1);

        MemberDTO member2 = new MemberDTO();
        member2.setName("hong2");
        repository.save(member2);

        List<MemberDTO> result = repository.findAll();

        Assertions.assertThat(result.size()).isEqualTo(2);

    }

}

/*
*  회원 리포지토리 테스트 케이스 작성
*
*  테스트 케이스 순서는 무작위로 생성된다.
*  member.setName() 을 통해서 같은 값이 들어갈 경우 에러가 발생.
*  따라서 테스트 케이스 한개가 끝나면 repository clear를 시켜줘야 한다. ( 테스트 끼리 의존관계가 성립되어서는 안됨!!!)
*
*
* */