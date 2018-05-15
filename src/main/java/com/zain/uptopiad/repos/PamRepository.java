package com.zain.uptopiad.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zain.uptopiad.models.Pam;

public interface PamRepository extends MongoRepository<Pam, String> {

	public List<Pam> findByMsisdn(int msisdn);
}
