package com.mofeisike.springcurddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mofeisike.springcurddemo.dao")
public class SpringCurdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCurdDemoApplication.class, args);
	}

}

