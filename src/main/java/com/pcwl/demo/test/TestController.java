package com.pcwl.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class TestController {
    @RequestMapping("/index")
    public String index() {
        return "test";
    }
}