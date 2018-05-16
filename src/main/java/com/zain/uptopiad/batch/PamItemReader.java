package com.zain.uptopiad.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

import com.zain.uptopiad.models.Pam;
import com.zain.uptopiad.repos.PamRepository;

public class PamItemReader implements ItemReader<Pam> {

	@Autowired
	private PamRepository pamRepository;

	@Override
	public Pam read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

		return pamRepository.findByStatus(1);
	}

}
