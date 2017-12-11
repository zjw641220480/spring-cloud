package org.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer//@EnableConfigServer注解说明了一个Config Server。同样我们使用@EnableEurekaClient将它注册到服务中心。
@EnableEurekaServer//注明是Eurake的服务端
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
