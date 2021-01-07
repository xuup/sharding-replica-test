package com.xup.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.abchina.example.dao")
@SpringBootApplication
public class ReplicaExampleMain {

    public static void main(String[] args) {
        SpringApplication.run(ReplicaExampleMain.class);
    }
}
