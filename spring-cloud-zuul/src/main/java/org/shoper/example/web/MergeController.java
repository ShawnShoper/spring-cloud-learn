package org.shoper.example.web;

import org.shoper.example.feignclient.api.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ShawnShoper on 2017/6/16.
 */
@RestController
public class MergeController {
//    @Autowired
//    ComputeClient computeClient;
    @RequestMapping(value = "/h",method = RequestMethod.GET)
    public String h(){
        ComputeClient computeClient = Bean.context.getBean(ComputeClient.class);
        Integer add = computeClient.add(2, 3);
        System.out.println(add);
        return "123";
    }
}
