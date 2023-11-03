package com.eureka.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClient01Application.class, args);
    }

}
