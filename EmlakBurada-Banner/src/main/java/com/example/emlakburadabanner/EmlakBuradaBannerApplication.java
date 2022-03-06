package com.example.emlakburadabanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EmlakBuradaBannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmlakBuradaBannerApplication.class, args);
    }

}
