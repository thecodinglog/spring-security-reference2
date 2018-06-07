package cothe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class WebController {
    @GetMapping("/loginPage")
    public String login(HttpServletRequest req, HttpServletResponse res, HttpSession session) {
        return "WEB-INF/view/login.jsp";
    }

    @GetMapping("/home")
    public String home() {
        return "WEB-INF/view/home.jsp";
    }

}
