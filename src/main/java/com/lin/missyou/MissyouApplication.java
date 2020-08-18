package com.lin.missyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.lin")
public class MissyouApplication {

    public static void main(String[] args) {
        SpringApplication.run(MissyouApplication.class, args);
    }

}
