package com.agungdh.line_be;

import org.springframework.boot.SpringApplication;

public class TestLineBeApplication {

    public static void main(String[] args) {
        SpringApplication.from(LineBeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
