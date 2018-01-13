package com.example.demoFeignOAuth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoFeignOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignOAuth2Application.class, args);
	}
}
