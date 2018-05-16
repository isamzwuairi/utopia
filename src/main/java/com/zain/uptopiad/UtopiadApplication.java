package com.zain.uptopiad;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UtopiadApplication {

//	@Autowired
//	private SubscriberRepository subscriberRepository;
//
//	@Autowired
//	private PamRepository pamRepository;
//	
//	@Autowired
//	private ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(UtopiadApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println("Subscriber found with findByMsisdn('794612342'):");
//		System.out.println("--------------------------------");
//		System.out.println(subscriberRepository.findByMsisdn(794612342));
//		
//		System.out.println("Profile found with findByMsisdn('794612342'):");
//		System.out.println("--------------------------------");
//		System.out.println(profileRepository.findByMsisdn(794612342));
//
//		System.out.println("Pam found with findByMsisdn('790914579'):");
//		System.out.println("--------------------------------");
//		System.out.println(pamRepository.findBySTATUS(0));
//		for (Pam pam : pamRepository.findByMsisdn(790914579)) {
//			System.out.println(pam);
//		}
//
//	}
}
