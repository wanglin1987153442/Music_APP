package com.soft1851.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wl
 * @ClassNameTestController
 * @Description TODO
 * @Date 2020/5/21
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
       return "HELLO";
    }
}
