package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/6 16:51
 */
@Configuration
public class AppContextConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
