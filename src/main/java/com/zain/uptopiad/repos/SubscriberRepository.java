package com.zain.uptopiad.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zain.uptopiad.models.Subscriber;

public interface SubscriberRepository extends MongoRepository<Subscriber, String> {

	public Subscriber findByMsisdn(int msisdn);
}
