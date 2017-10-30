package com.ml;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ml.config.BatchConfig;

//import java.util.Timer;
//import java.util.TimerTask;
//
//public class App {
//
//	public static void main(String[] args) {
//		Timer timer = new Timer();
//		TimerTask task = new TimerTaskImp();
//		timer.schedule(task, 0, 1);
//	}
//
//}
@EnableBatchProcessing
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchConfig.class, args)));
	}
}