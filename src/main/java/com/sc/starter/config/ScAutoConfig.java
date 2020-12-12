package com.sc.starter.config;

import com.sc.starter.ConditionalOnScStartEnabled;
import com.sc.starter.properties.ScProperties;
import com.sc.starter.service.ScService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : ScConfig
 * @Description :  测试使用的配置
 * @Author : wenrong
 * @Date: 2020-12-11 21:48
 */
@Configuration
@EnableConfigurationProperties({ScProperties.class})
@ConditionalOnScStartEnabled
public class ScAutoConfig {

    @Bean(name="scService")
    public ScService scService(){
        return new ScService();
    }

}
