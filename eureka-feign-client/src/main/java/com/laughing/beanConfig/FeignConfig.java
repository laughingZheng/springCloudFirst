package com.laughing.beanConfig;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @Author:zhenganke
 * @Description:
 * @Date: 13:57
 * @Modified By:
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer FeignConfig(){
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
