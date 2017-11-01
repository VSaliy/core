package com.vitaliysaliy.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.vitaliysaliy")
public class FeignConfiguration {

}
