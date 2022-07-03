package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {

        model.addAttribute("data", "hello!!!!!!!");
        return "hello"; // return 값에 적힌 곳을 찾아서 렌더링 하라는 의미. /templates/hello.html

    }
}
