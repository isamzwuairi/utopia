package com.zain.uptopiad;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PamRepository extends MongoRepository<Pam, String> {

	public List<Pam> findByMsisdn(int msisdn);
}
