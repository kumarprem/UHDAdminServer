package com.homedepot.admin.UHDAdminServer;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableDiscoveryClient
@ComponentScan("com.homedepot.admin.UHDAdminServer")
public class UhdAdminServerApplication implements ApplicationContextAware {

	private static  ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(UhdAdminServerApplication.class, args);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
  		context = applicationContext;
	}
}
