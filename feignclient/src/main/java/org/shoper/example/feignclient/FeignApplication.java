package org.shoper.example.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import javax.script.ScriptException;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@EnableCircuitBreaker 不需要启动该断路器配置,Feign 本身带有
public class FeignApplication {
    public static void main(String[] args) throws ScriptException {
        SpringApplication.run(FeignApplication.class, args);
    }
}