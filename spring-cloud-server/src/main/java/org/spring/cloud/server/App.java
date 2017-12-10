package org.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@EnableEurekaServer
@SpringBootApplication
@RestController
public class App {
	@RequestMapping("/index")
	public String index() {
		System.out.println("AppApplication.index()");
		return "spring-cloud-server";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
