package org.shoper.example.feignclient;

import org.shoper.example.feignclient.api.ComputeClientHystrixApi;
import org.springframework.web.bind.annotation.RequestParam;

//@Component
public class ComputeClientHystrix implements ComputeClientHystrixApi {
    @Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -888;
    }

}