package com.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.cloud.zuul.zuulFilter.AccessFilter;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class TestSpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudZuulApplication.class, args);
	}
//	@Bean
//	public AccessFilter accessFilter() {
//		return new AccessFilter();
//	}
}
