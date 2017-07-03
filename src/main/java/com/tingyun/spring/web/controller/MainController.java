package com.tingyun.spring.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/6/26.
 */
@RestController
public class MainController {


    @RequestMapping("/hello")
    public String hello(String name,int state){
        return "name:"+name+"state:"+state;
    }
}
