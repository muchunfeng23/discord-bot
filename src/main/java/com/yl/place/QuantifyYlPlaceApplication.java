package com.yl.place;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author minjordan
 */
@EnableScheduling
@SpringBootApplication
public class QuantifyYlPlaceApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuantifyYlPlaceApplication.class, args);
	}
}
