package com.zain.uptopiad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtopiadApplication implements CommandLineRunner {

	@Autowired
	private SubscriberRepository subscriberRepository;

	@Autowired
	private PamRepository pamRepository;

	public static void main(String[] args) {
		SpringApplication.run(UtopiadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Subscriber found with findByMsisdn('794612342'):");
		System.out.println("--------------------------------");
		System.out.println(subscriberRepository.findByMsisdn(794612342));

		System.out.println("Pam found with findByMsisdn('794612342'):");
		System.out.println("--------------------------------");
		System.out.println(pamRepository.findByMsisdn(792554593));

	}
}
