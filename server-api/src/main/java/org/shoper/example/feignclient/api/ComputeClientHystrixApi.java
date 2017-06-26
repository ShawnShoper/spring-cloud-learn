package org.shoper.example.feignclient.api;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/1/24 0024.
 */
@Component
public interface ComputeClientHystrixApi extends ComputeClient {
    @Override
    default Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b){
        return -9999;
    }
}