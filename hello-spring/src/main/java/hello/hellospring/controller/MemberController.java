package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
}
