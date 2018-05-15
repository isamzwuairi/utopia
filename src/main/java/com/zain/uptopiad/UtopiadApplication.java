package com.zain.uptopiad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zain.uptopiad.models.Pam;
import com.zain.uptopiad.repos.PamRepository;
import com.zain.uptopiad.repos.ProfileRepository;
import com.zain.uptopiad.repos.SubscriberRepository;

@SpringBootApplication
public class UtopiadApplication implements CommandLineRunner {

	@Autowired
	private SubscriberRepository subscriberRepository;

	@Autowired
	private PamRepository pamRepository;
	
	@Autowired
	private ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(UtopiadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Subscriber found with findByMsisdn('794612342'):");
		System.out.println("--------------------------------");
		System.out.println(subscriberRepository.findByMsisdn(794612342));
		
		System.out.println("Profile found with findByMsisdn('794612342'):");
		System.out.println("--------------------------------");
		System.out.println(profileRepository.findByMsisdn(794612342));

		System.out.println("Pam found with findByMsisdn('790914579'):");
		System.out.println("--------------------------------");
//		System.out.println(pamRepository.findByMsisdn(790914579));
		for (Pam pam : pamRepository.findByMsisdn(790914579)) {
			System.out.println(pam);
		}

	}
}
