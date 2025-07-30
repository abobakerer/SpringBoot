package com.example.springboot_fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringbootFundamentalsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootFundamentalsApplication.class, args);
	}

}
