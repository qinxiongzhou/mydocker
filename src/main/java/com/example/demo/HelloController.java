package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author grid
 * @Date 2020/1/1
 * @Version V1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/hello/{req}")
    public String hello(@PathVariable String req){
        return "Hello," + req + "!";
    }
}
