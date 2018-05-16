package com.zain.uptopiad.batch;


import org.springframework.batch.item.ItemProcessor;

import com.zain.uptopiad.models.Pam;

public class PamItemProcessor implements ItemProcessor<Pam, Pam> {

	@Override
	public Pam process(final Pam pam) throws Exception {
		final String ORIGIN_NODE_ID = pam.getORIGIN_NODE_ID().toUpperCase();

		Pam transformedPam = pam;
		transformedPam.setORIGIN_NODE_ID(ORIGIN_NODE_ID);

		return transformedPam;
	}

}
