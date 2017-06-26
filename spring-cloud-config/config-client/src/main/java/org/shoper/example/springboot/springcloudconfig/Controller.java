package org.shoper.example.springboot.springcloudconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ShawnShoper on 2017/2/16.
 */
@RestController
@RefreshScope
public class Controller {
    @Value("${server.port}")
    private String hello;

    @RequestMapping("/hello")
    public String hello() {
        return hello;
    }
}
