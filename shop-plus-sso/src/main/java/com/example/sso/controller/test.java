package com.example.sso.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * yzw
 * 2023/3/7
 */
@RestController
@RequestMapping("test")
public class test {
    @RequestMapping("/{name}")
    public String test(@PathVariable String name){
        return "成功，访问参数："+name;
    }
}
