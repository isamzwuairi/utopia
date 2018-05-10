package com.zain.uptopiad;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubscriberRepository extends MongoRepository<Subscriber, String> {

	public Subscriber findByMsisdn(int msisdn);
}
