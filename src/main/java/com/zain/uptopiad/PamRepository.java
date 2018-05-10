package com.zain.uptopiad;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PamRepository extends MongoRepository<Pam, String> {

	public Pam findByMsisdn(int msisdn);
}
