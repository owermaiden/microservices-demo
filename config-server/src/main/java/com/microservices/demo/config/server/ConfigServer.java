package com.microservices.demo.config.server;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
