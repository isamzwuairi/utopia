package com.zain.uptopiad.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Subscriber {
	@Id
	private String id;

	@Field("msisdn_id")
	private int msisdn;
	private int service_calss;
	private int wallet_1;
	private int wallet_2;
	private int wallet_3;
	private int wallet_4;
	private int wallet_5;
	private int wallet_6;

	public Subscriber() {
	}

	public Subscriber(String id, int msisdn_id, int service_calss, int wallet_1, int wallet_2, int wallet_3,
			int wallet_4, int wallet_5, int wallet_6) {
		super();
		this.id = id;
		this.msisdn = msisdn_id;
		this.service_calss = service_calss;
		this.wallet_1 = wallet_1;
		this.wallet_2 = wallet_2;
		this.wallet_3 = wallet_3;
		this.wallet_4 = wallet_4;
		this.wallet_5 = wallet_5;
		this.wallet_6 = wallet_6;
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

	public void setMsisdn(int msisdn_id) {
		this.msisdn = msisdn_id;
	}

	public int getService_calss() {
		return service_calss;
	}

	public void setService_calss(int service_calss) {
		this.service_calss = service_calss;
	}

	public int getWallet_1() {
		return wallet_1;
	}

	public void setWallet_1(int wallet_1) {
		this.wallet_1 = wallet_1;
	}

	public int getWallet_2() {
		return wallet_2;
	}

	public void setWallet_2(int wallet_2) {
		this.wallet_2 = wallet_2;
	}

	public int getWallet_3() {
		return wallet_3;
	}

	public void setWallet_3(int wallet_3) {
		this.wallet_3 = wallet_3;
	}

	public int getWallet_4() {
		return wallet_4;
	}

	public void setWallet_4(int wallet_4) {
		this.wallet_4 = wallet_4;
	}

	public int getWallet_5() {
		return wallet_5;
	}

	public void setWallet_5(int wallet_5) {
		this.wallet_5 = wallet_5;
	}

	public int getWallet_6() {
		return wallet_6;
	}

	public void setWallet_6(int wallet_6) {
		this.wallet_6 = wallet_6;
	}

	public int getWallets() {
		return wallet_1 + wallet_2 + wallet_3 + wallet_4 + wallet_5 + wallet_6;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", msisdn=" + msisdn + ", service_calss=" + service_calss + ", wallet_1="
				+ wallet_1 + ", wallet_2=" + wallet_2 + ", wallet_3=" + wallet_3 + ", wallet_4=" + wallet_4
				+ ", wallet_5=" + wallet_5 + ", wallet_6=" + wallet_6 + "]";
	}

}
