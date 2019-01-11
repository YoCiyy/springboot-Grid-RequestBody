package com.yoci.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yoci on 2018/9/23.
 */
@RestController
@EnableAutoConfiguration
@ComponentScan
public class RequestBodyController {

    @RequestMapping("/SerializeUrl")
    public void SerializeUrl(@RequestBody user user){
        System.out.println(user);
    }

    @RequestMapping("/SerializeArray")
    public void SerializeArray(@RequestBody user user){
        System.out.println(user);
    }

    @RequestMapping("/autoSetJsonData")
    public void autoSetJsonData(@RequestBody  user user){
        System.out.println(user);
    }

}
