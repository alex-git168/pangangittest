package com.example.demogit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetController {
    @ResponseBody
    @RequestMapping("/abc")
    public String getabc(){
        return "abc";
    }
}
