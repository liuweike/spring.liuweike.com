package com.liuweike.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description: // 入口
 * <p>
 * Created by liuweike on 2019-04-07.
 * Create time: 21:21
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.liuweike.spring")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args).registerShutdownHook();
    }
}
