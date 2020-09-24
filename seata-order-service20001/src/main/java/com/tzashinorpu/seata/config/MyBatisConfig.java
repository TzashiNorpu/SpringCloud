package com.tzashinorpu.seata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.tzashinorpu.seata.dao"})
public class MyBatisConfig {
}
