package com.cd.bootconsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    private HelloServiceConsumer helloServiceConsumer;

    @GetMapping("/sayHi")
    public String hello(){

        return helloServiceConsumer.hello("chan");
    }
}
