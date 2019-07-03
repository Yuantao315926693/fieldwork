package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class index {
    @RequestMapping("/")
    public String f()
    {return "index.html";}
}
