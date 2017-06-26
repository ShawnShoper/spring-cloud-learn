package org.shoper.example.hystrix.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ShawnShoper on 2017/6/26.
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "addFallBack")
    public Integer add (@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        return r;
    }
    public Integer addFallBack(Integer a ,Integer b){
        return this.restTemplate.getForObject("http://192.168.2.56:2221/add?a="+a+"&b="+b,Integer.class);
    }
}
