package com.bjpowernode.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolname;

    @Value("${website}")
    private String website;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "Hello" + schoolname + ":" + website;
    }
}
