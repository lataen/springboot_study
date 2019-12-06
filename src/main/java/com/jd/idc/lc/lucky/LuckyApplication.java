package com.jd.idc.lc.lucky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class LuckyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuckyApplication.class, args);
    }

}
