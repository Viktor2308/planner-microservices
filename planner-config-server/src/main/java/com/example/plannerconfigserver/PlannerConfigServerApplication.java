package com.example.plannerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PlannerConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlannerConfigServerApplication.class, args);
    }

}
