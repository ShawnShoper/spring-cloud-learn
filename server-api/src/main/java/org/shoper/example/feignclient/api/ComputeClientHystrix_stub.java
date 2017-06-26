package org.shoper.example.feignclient.api;

import org.springframework.web.bind.annotation.RequestParam;

public class ComputeClientHystrix_stub implements ComputeClientHystrixApi {

    @Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -8788;
    }

}