package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/*
* Controller에서 사용되는 MemberService 객체 인스턴스를 new로 생성하면
* 여러 Controller마다 생성되는
* 문제점이 발생 => MemberService를 생성자로 만들어주고 @Autowired 를 붙인다.
* @Autowired는 Spring Container에서 memberService를 가져온다.
*
* */

@Controller
public class MemberController {

    private final MemberService memberService;

    // DI
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new") // home.html에서 버튼을 누르면 mebmers/createMemberForm으로 보냄
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        System.out.println(form.getName());
        memberService.join(member);

        return "redirect:/";
    }


    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members); // view로 값 전달
        return "members/memberList"; // memberList로 사이트 이동
    }

}
