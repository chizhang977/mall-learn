package com.justin.mall.malllearn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title: MyBatisConfig</p>
 */
@Configuration
@MapperScan("com.justin.mall.malllearn.mbg.mapper")
public class MyBatisConfig {
}
