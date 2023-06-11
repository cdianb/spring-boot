package com.mei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication 标注这个类是一个spring boot的应用,启动类下的所有资源被导入
@SpringBootApplication(scanBasePackages = "com.mei")
public class SpringBoot01HelloWorldApplication {

    public static void main(String[] args) {
        //将springBoot应用启动
        SpringApplication.run(SpringBoot01HelloWorldApplication.class, args);
    }

}
