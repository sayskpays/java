package hello.hellospring.service;

import hello.hellospring.domain.MemberDTO;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    // Field
    MemberService memberService;

    /*
    * 저장되는 store가 static여서 공유 객체이기 때문에 상관은 없지만 new로 새로운 인스턴스를 생성하면
    * 새로운 저장소를 만든다는 의미이기 때문에 다른 저장소로 테스트를 하는게 된다.
    *
    * MemberService의  private final MemberRepository memberRepository = new MemoryMemberRepository();를
    *
    * private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    * 이렇게 만들어서 직접 new로 생성하는 것이 아니라 외부에서 넣어주도록 생성자로 변경
    *  ==> 이런것을 DI (Dependency Injection) 이라고 한다.
    *
    * */
    MemoryMemberRepository repository;

    @BeforeEach
    public void beforeEach() {
        repository =  new MemoryMemberRepository();
        memberService = new MemberService(repository);
    }


    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

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

    /*
     *  join의 validateDuplicateMember 부분 예외 발생 테스트
     * */
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


        /*
        * 위의 assertThrows와 같은 코드 assertThrows를 권장
        * */

//        try {
//            memberService.join(member2);
//            fail();
//        } catch (IllegalStateException e) {
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//        }

        //then
    }


    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}