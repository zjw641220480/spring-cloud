package org.spring.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@EnableEurekaClient//注解表明是Eureka的client
@RefreshScope
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Value("${hello}")
	String hello;
	@RequestMapping(value = "/hello")
	public String hello() {
		System.out.println("App.hello()");
		return hello;
	}
}
