package hello.hellospring.service;

import hello.hellospring.domain.MemberDTO;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired // MemberService는 MemberRepository가 필요하기 때문에 @Autowired로 의존성 주입
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
        회원가입
        */
    public Long join(MemberDTO member) {
        validateDuplicateMember(member); // 중복 회원 검증

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(MemberDTO member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*
    *  전체 회원 조회
    * */
    public List<MemberDTO> findMembers() {
        return memberRepository.findAll();
    }

    /*
    * 회원 찾기
    * */
    public Optional<MemberDTO> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
