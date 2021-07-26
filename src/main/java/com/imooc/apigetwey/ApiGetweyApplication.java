package com.imooc.apigetwey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGetweyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGetweyApplication.class, args);
    }

}
