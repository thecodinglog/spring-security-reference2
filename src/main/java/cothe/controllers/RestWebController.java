package cothe.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebController{
    @GetMapping("/status")
    public String status(){
        return "Ok!";
    }
}