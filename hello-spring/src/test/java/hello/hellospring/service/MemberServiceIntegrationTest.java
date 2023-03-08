package hello.hellospring.service;

import hello.hellospring.domain.MemberDTO;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {

    // Field
    @Autowired MemberService memberService;
    @Autowired
    MemberRepository repository;

    // Method
    @Test
    void 회원가입() {
        // given
        MemberDTO member = new MemberDTO();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then ( 검증 )
        MemberDTO findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());

    }

    @Test
    public void 중복_회원_예외() {
        // given
        MemberDTO member1 = new MemberDTO();
        member1.setName("spring");

        MemberDTO member2 = new MemberDTO();
        member2.setName("spring");

        //when
        memberService.join(member1);
        // 오른쪽 람다식이 실행 됐을때 IllegalStateException 이 터져야 한다 라는 메소드
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        // assertThrows는 반환값이 있기 때문에 다음과 같이 메세지 검증을 하면 된다.
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

    }
}