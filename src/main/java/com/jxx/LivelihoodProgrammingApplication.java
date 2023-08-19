package com.jxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class LivelihoodProgrammingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivelihoodProgrammingApplication.class, args);
    }

}
