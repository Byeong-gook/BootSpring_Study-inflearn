package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") //localhost:8080으로들어오면 호출이됨
    public String home() {
        return "home";
    }
}
