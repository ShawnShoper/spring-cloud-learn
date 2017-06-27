package org.shoper.example.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TicketApplication {
	public static void main(String[] args) {
		SpringApplication.run(TicketApplication.class, args);
	}
}