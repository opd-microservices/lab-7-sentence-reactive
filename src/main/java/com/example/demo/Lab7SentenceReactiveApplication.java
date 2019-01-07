package com.example.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class Lab7SentenceReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab7SentenceReactiveApplication.class, args);
	}
	
    /**
     * A source of threads.
     */
	@Bean
	public Executor executor() {
		return Executors.newFixedThreadPool(6);
	}
}
