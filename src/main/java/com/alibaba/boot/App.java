package com.alibaba.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * @author pinghuai
 * @date 2017/02/27
 */
@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App {

    public static void main( String[] args ){
        SpringApplication.run(App.class,args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "Hello World！！！";
    }

}
