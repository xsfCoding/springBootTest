package com.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
////
//@RestController
//@EnableAutoConfiguration()
//@RequestMapping("/Hello")
@SpringBootApplication
public class HelloWorld{

//    @RequestMapping(value = "/sayhello", method =RequestMethod.GET)
//    public String sayhello(){
//        return "i am say hello to you";
//    }
    public static void main(String[] args) {
      //  System.setProperty("spring.devtools.restart.enabled","flase");

        SpringApplication.run(HelloWorld.class,args);
    }

}
