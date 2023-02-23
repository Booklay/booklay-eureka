package com.nhnacademy.booklay.eureka.booklay_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BooklayEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooklayEurekaApplication.class, args);
    }
}
