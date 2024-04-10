package com.ylch.springboot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloController {

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "spring boot docker ";
    }

   public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
   }



}
