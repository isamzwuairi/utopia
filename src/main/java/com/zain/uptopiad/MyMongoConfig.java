package com.zain.uptopiad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;


import java.util.*;

@Configuration
public class MyMongoConfig extends AbstractMongoConfiguration{

	@Override
	public String getDatabaseName() {
		return "utopia";
	}

	@SuppressWarnings("deprecation")
	@Override
	@Bean
	public MongoClient mongoClient() {
		return new MongoClient(Collections.singletonList(new ServerAddress("127.0.0.1", 27017)),
				Collections.singletonList(MongoCredential.createCredential("zain", "utopia", "Amman#1!".toCharArray())));
	}
}
