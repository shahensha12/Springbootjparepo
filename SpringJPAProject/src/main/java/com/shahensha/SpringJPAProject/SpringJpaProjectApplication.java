package com.shahensha.SpringJPAProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.shahensha.SpringJPAProject.config.DbDetails;

@SpringBootApplication
@EnableConfigurationProperties(DbDetails.class)
public class SpringJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaProjectApplication.class, args);
	}

}
