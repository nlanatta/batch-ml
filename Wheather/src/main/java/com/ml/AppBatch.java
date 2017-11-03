package com.ml;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class AppBatch {	

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(AppBatch.class, args)));
	}	
}
