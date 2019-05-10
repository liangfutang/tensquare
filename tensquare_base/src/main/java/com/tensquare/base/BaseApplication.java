package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }


    /**
     * 生成分布式id用的工具
     * @return
     */
    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1, 1);
    }

}
