package com.manjusha.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        System.out.println("index");
        return "welcome";
    }

    @RequestMapping("/student")
    public String student(){
        System.out.println("student");
        return "student";
    }
}
