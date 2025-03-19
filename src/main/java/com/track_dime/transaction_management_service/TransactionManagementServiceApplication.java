package com.track_dime.transaction_management_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.*;

@SpringBootApplication
public class TransactionManagementServiceApplication {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

/*
		ExecutorService executorService = Executors.newFixedThreadPool(10, new CustomizableThreadFactory());
		executorService.submit(() -> { System.out.println("Helllo!!!");});
*/

		SpringApplication.run(TransactionManagementServiceApplication.class, args);
	}

}
