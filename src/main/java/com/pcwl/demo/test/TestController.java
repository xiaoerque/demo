package com.pcwl.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class TestController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
    @RequestMapping("/dateTest")
    public String dateTest() {
        return "elementTest/datetimepickerTest";
    }
    @RequestMapping("/dateTestOne")
    public String dateTestOne() {
        return "elementTest/datetimepickerTestOne";
    }
}