package com.zain.uptopiad.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zain.uptopiad.models.Profile;

public interface ProfileRepository extends MongoRepository<Profile, String> {
	public Profile findByMsisdn(int msisdn);
}
