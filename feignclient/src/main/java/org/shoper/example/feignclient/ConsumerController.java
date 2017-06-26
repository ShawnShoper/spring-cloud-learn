package org.shoper.example.feignclient;

import org.shoper.example.feignclient.api.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	ComputeClient computeClient;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add() {
		return computeClient.add(10, 20);
	}
//	@RequestMapping(value = "/add1", method = RequestMethod.GET)
//	public String test(){
//		ComputeClient target = SpringMvcFeign.target(ComputeClient.class, "http://127.0.0.1:2221/");
//		return target.add(5,2)+"";
//	}
}