package com.mofeisike.springcurddemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: HelloController <br>
 * date: 2020/6/17 11:25 <br>
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        return "hello-123";
    }


}
