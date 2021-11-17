package com.cnpc.analysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cnpc.analysis.mapper")
public class AnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalysisApplication.class, args);
    }

}
