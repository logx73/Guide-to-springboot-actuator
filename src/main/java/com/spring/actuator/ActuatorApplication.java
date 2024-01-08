package com.spring.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
	It is combination of three annotations
	@ComponentScan - Scan all the files annotated with @Components & Meta annotations like @Controller
					 @Service, @Repository and registers the bean with application context.
	@EnableAutoConfiguration - Scans classpath and autoconfigures required dependencies without the need
								to manually configuring them like dataSourceAutoConfiguration, WebServerAutoConfiguration
	@SpringConfiguration - Scans classes with @Configuration annotation for registering custom beans.
 */
public class ActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}

}
