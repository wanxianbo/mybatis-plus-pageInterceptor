package com.wanxianbo.user.config;

import com.wanxianbo.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanxianbo
 * @description
 * @date 创建于 2022/5/27
 */
@Configuration
public class MybatisConfig {
    @Bean
    public PaginationInterceptor getPaginationInterceptor() {
        return new PaginationInterceptor();
    }
}
