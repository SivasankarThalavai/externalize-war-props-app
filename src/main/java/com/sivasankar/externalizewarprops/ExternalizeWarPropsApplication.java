package com.sivasankar.externalizewarprops;

import com.sivasankar.externalizewarprops.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ExternalizeWarPropsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalizeWarPropsApplication.class, args);
	}

}
