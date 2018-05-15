package com.zain.uptopiad.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Profile {
	@Id
	private String id;

	@Field("ACCOUNT_NUMBER")
	private int msisdn;
	private double MIN_AVG_ARPU;
	private double MAX_AVG_ARPU;

	public Profile() {
	}

	public Profile(String id, int msisdn, double mIN_AVG_ARPU, double mAX_AVG_ARPU) {
		super();
		this.id = id;
		this.msisdn = msisdn;
		MIN_AVG_ARPU = mIN_AVG_ARPU;
		MAX_AVG_ARPU = mAX_AVG_ARPU;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(int msisdn) {
		this.msisdn = msisdn;
	}

	public double getMIN_AVG_ARPU() {
		return MIN_AVG_ARPU;
	}

	public void setMIN_AVG_ARPU(double mIN_AVG_ARPU) {
		MIN_AVG_ARPU = mIN_AVG_ARPU;
	}

	public double getMAX_AVG_ARPU() {
		return MAX_AVG_ARPU;
	}

	public void setMAX_AVG_ARPU(double mAX_AVG_ARPU) {
		MAX_AVG_ARPU = mAX_AVG_ARPU;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", msisdn=" + msisdn + ", MIN_AVG_ARPU=" + MIN_AVG_ARPU + ", MAX_AVG_ARPU="
				+ MAX_AVG_ARPU + "]";
	}
}
