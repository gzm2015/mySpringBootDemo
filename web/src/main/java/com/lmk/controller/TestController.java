package com.lmk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用Controller
 *
 * @author LiuMengKe
 * @create 2018-04-04-15:40
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String testUrl(){
        return "hello world 1322222";
    }
}
