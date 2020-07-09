package com.firenay.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//手动指定扫描的包
@MapperScan("com.firenay.boot.mapper")
@ComponentScan("com.firenay.spring.bo2ot.handler")
@SpringBootApplication
public class SpringBootIntegrationApplication {

//	http://127.0.0.1:8080/test/thymeleaf

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntegrationApplication.class, args);
	}
}
