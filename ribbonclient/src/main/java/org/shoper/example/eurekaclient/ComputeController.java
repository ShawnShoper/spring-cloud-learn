package org.shoper.example.eurekaclient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ComputeController {

	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	ComputeService computeService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add () {
		return computeService.addService();
	}
}