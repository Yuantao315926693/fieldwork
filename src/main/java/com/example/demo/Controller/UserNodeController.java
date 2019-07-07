package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserNodeController {
//    @RequestMapping(value = "/index")
//    public String index(){
//        return "/login_test.html";
//    }
    @RequestMapping("/houtai")
    public String houtai(){
        return "houtai.html";
    }
    @RequestMapping("/")
    public String f() {
//        return "index.html";
        return "login.html";
    }
}
