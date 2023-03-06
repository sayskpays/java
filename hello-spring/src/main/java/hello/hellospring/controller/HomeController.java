package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // "/"의 의미 => localhost:8080으로 들어오면 실행
    @GetMapping("/")
    public String home() {
        return "home";
    }

}
