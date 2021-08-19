package com.dell.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Phase3ZuulEdgeServer08192021Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3ZuulEdgeServer08192021Application.class, args);
	}

}
