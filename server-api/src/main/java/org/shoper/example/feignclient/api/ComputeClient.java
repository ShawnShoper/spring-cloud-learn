package org.shoper.example.feignclient.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//这里只需要描述调用的服务
@FeignClient( value = "compute-service",fallback = ComputeClientHystrixApi.class)
public interface ComputeClient {
    //只需要描述调用的接口
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}