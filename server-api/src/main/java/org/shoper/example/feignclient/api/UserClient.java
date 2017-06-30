package org.shoper.example.feignclient.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by ShawnShoper on 2017/6/28.
 */
@FeignClient("user-service")
public interface UserClient {
    @GetMapping("/user/{id}")
    User findUserById(@PathVariable("id") String id);
}
