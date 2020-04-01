package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController//以JSON形式反馈至页面
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Value("${name}")//获取.yml文件中值
    private String name;

    @Value("${Url}")//获取.yml文件中值
    private String url;


    @RequestMapping//路径映射，对应浏览器访问的地址，访问该路径则执行下面函数
    public String hello() {
        return name + "CSDN 博客："+ url;
        //return name;
    }
}


