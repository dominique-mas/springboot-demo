package com.teachersdunet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * [@SPringBootApplication] équivaut à :
 * 
 * [@EnableAutoConfiguration] va permettre de "deviner" la configuration à mettre en place
 * [@Configuration] la classe va permettre de configurer l'application
 * [@ComponentScan]
 * 
 * @author Dominique Mas
 *
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
