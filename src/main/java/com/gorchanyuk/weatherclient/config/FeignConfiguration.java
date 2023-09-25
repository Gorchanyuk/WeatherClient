package com.gorchanyuk.weatherclient.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.gorchanyuk.weatherclient")
public class FeignConfiguration {
}
