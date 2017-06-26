package org.shoper.example.feignclient.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/1/24 0024.
 */
@Configuration
public class StubConfig {


//    @Bean
//    @ConditionalOnMissingBean(value = ComputeClientHystrixApi.class)
    public ComputeClientHystrixApi getComputeClientHystrix(){
        return new ComputeClientHystrix_stub();
    }
}

