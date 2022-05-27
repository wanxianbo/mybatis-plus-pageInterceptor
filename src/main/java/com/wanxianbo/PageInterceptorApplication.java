package com.wanxianbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wanxianbo
 * @description
 * @date 创建于 2022/5/27
 */
@SpringBootApplication
@MapperScan("com.wanxianbo.**.mapper")
public class PageInterceptorApplication {
    public static void main(String[] args) {
        SpringApplication.run(PageInterceptorApplication.class, args);
    }
}
