package cothe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/loginPage")
    public String login() {
        return "login.jsp";
    }
}
