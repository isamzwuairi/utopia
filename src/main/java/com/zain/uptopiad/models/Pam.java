package com.zain.uptopiad.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.lang.Nullable;

public class Pam {
	@Id
	private String id;

	@Field("ACCOUNT_NUMBER")
	private int msisdn;
	private Date TIMES_TAMP;
	private int SERVICE_CLASS_ID;
	private String ORIGIN_NODE_ID;
	private int PED_EP_PAM_CLASS_ID;
	private int PED_EP_SCHEDULE_ID;
	private int PAM_INDICATOR;
	private double BALANCE_BEFORE;
	private double BALANCE_AFTER;
	private double DELTA_AMOUNT;
	@Nullable
	private double ADAS_ACC_VALUE_BEFORE;
	@Nullable
	private double ADAS_ACC_VALUE_AFTER;
	@Nullable
	private double ADAS_ADJUSTMENT_AMOUNT;
	@Nullable
	private int ADS_ACCUM_VALUE_BEFORE;
	@Nullable
	private int ADS_ACCUM_VALUE_AFTER;
	@Nullable
	private String TDF;

	public Pam() {
	}

	public Pam(String id, int aCCOUNT_NUMBER, Date tIMES_TAMP, int sERVICE_CLASS_ID, String oRIGIN_NODE_ID,
			int pED_EP_PAM_CLASS_ID, int pED_EP_SCHEDULE_ID, int pAM_INDICATOR, double bALANCE_BEFORE,
			double bALANCE_AFTER, double dELTA_AMOUNT, double aDAS_ACC_VALUE_BEFORE, double aDAS_ACC_VALUE_AFTER,
			double aDAS_ADJUSTMENT_AMOUNT, int aDS_ACCUM_VALUE_BEFORE, int aDS_ACCUM_VALUE_AFTER, String tDF) {
		super();
		this.id = id;
		msisdn = aCCOUNT_NUMBER;
		TIMES_TAMP = tIMES_TAMP;
		SERVICE_CLASS_ID = sERVICE_CLASS_ID;
		ORIGIN_NODE_ID = oRIGIN_NODE_ID;
		PED_EP_PAM_CLASS_ID = pED_EP_PAM_CLASS_ID;
		PED_EP_SCHEDULE_ID = pED_EP_SCHEDULE_ID;
		PAM_INDICATOR = pAM_INDICATOR;
		BALANCE_BEFORE = bALANCE_BEFORE;
		BALANCE_AFTER = bALANCE_AFTER;
		DELTA_AMOUNT = dELTA_AMOUNT;
		ADAS_ACC_VALUE_BEFORE = aDAS_ACC_VALUE_BEFORE;
		ADAS_ACC_VALUE_AFTER = aDAS_ACC_VALUE_AFTER;
		ADAS_ADJUSTMENT_AMOUNT = aDAS_ADJUSTMENT_AMOUNT;
		ADS_ACCUM_VALUE_BEFORE = aDS_ACCUM_VALUE_BEFORE;
		ADS_ACCUM_VALUE_AFTER = aDS_ACCUM_VALUE_AFTER;
		TDF = tDF;
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

	public void setMsisdn(int aCCOUNT_NUMBER) {
		msisdn = aCCOUNT_NUMBER;
	}

	public Date getTIMES_TAMP() {
		return TIMES_TAMP;
	}

	public void setTIMES_TAMP(Date tIMES_TAMP) {
		TIMES_TAMP = tIMES_TAMP;
	}

	public int getSERVICE_CLASS_ID() {
		return SERVICE_CLASS_ID;
	}

	public void setSERVICE_CLASS_ID(int sERVICE_CLASS_ID) {
		SERVICE_CLASS_ID = sERVICE_CLASS_ID;
	}

	public String getORIGIN_NODE_ID() {
		return ORIGIN_NODE_ID;
	}

	public void setORIGIN_NODE_ID(String oRIGIN_NODE_ID) {
		ORIGIN_NODE_ID = oRIGIN_NODE_ID;
	}

	public int getPED_EP_PAM_CLASS_ID() {
		return PED_EP_PAM_CLASS_ID;
	}

	public void setPED_EP_PAM_CLASS_ID(int pED_EP_PAM_CLASS_ID) {
		PED_EP_PAM_CLASS_ID = pED_EP_PAM_CLASS_ID;
	}

	public int getPED_EP_SCHEDULE_ID() {
		return PED_EP_SCHEDULE_ID;
	}

	public void setPED_EP_SCHEDULE_ID(int pED_EP_SCHEDULE_ID) {
		PED_EP_SCHEDULE_ID = pED_EP_SCHEDULE_ID;
	}

	public int getPAM_INDICATOR() {
		return PAM_INDICATOR;
	}

	public void setPAM_INDICATOR(int pAM_INDICATOR) {
		PAM_INDICATOR = pAM_INDICATOR;
	}

	public double getBALANCE_BEFORE() {
		return BALANCE_BEFORE;
	}

	public void setBALANCE_BEFORE(double bALANCE_BEFORE) {
		BALANCE_BEFORE = bALANCE_BEFORE;
	}

	public double getBALANCE_AFTER() {
		return BALANCE_AFTER;
	}

	public void setBALANCE_AFTER(double bALANCE_AFTER) {
		BALANCE_AFTER = bALANCE_AFTER;
	}

	public double getDELTA_AMOUNT() {
		return DELTA_AMOUNT;
	}

	public void setDELTA_AMOUNT(double dELTA_AMOUNT) {
		DELTA_AMOUNT = dELTA_AMOUNT;
	}

	public double getADAS_ACC_VALUE_BEFORE() {
		return ADAS_ACC_VALUE_BEFORE;
	}

	public void setADAS_ACC_VALUE_BEFORE(double aDAS_ACC_VALUE_BEFORE) {
		ADAS_ACC_VALUE_BEFORE = aDAS_ACC_VALUE_BEFORE;
	}

	public double getADAS_ACC_VALUE_AFTER() {
		return ADAS_ACC_VALUE_AFTER;
	}

	public void setADAS_ACC_VALUE_AFTER(double aDAS_ACC_VALUE_AFTER) {
		ADAS_ACC_VALUE_AFTER = aDAS_ACC_VALUE_AFTER;
	}

	public double getADAS_ADJUSTMENT_AMOUNT() {
		return ADAS_ADJUSTMENT_AMOUNT;
	}

	public void setADAS_ADJUSTMENT_AMOUNT(double aDAS_ADJUSTMENT_AMOUNT) {
		ADAS_ADJUSTMENT_AMOUNT = aDAS_ADJUSTMENT_AMOUNT;
	}

	public int getADS_ACCUM_VALUE_BEFORE() {
		return ADS_ACCUM_VALUE_BEFORE;
	}

	public void setADS_ACCUM_VALUE_BEFORE(int aDS_ACCUM_VALUE_BEFORE) {
		ADS_ACCUM_VALUE_BEFORE = aDS_ACCUM_VALUE_BEFORE;
	}

	public int getADS_ACCUM_VALUE_AFTER() {
		return ADS_ACCUM_VALUE_AFTER;
	}

	public void setADS_ACCUM_VALUE_AFTER(int aDS_ACCUM_VALUE_AFTER) {
		ADS_ACCUM_VALUE_AFTER = aDS_ACCUM_VALUE_AFTER;
	}

	public String getTDF() {
		return TDF;
	}

	public void setTDF(String tDF) {
		TDF = tDF;
	}

	@Override
	public String toString() {
		return "Pam [id=" + id + ", msisdn=" + msisdn + ", TIMES_TAMP=" + TIMES_TAMP + ", SERVICE_CLASS_ID="
				+ SERVICE_CLASS_ID + ", ORIGIN_NODE_ID=" + ORIGIN_NODE_ID + ", PED_EP_PAM_CLASS_ID="
				+ PED_EP_PAM_CLASS_ID + ", PED_EP_SCHEDULE_ID=" + PED_EP_SCHEDULE_ID + ", PAM_INDICATOR="
				+ PAM_INDICATOR + ", BALANCE_BEFORE=" + BALANCE_BEFORE + ", BALANCE_AFTER=" + BALANCE_AFTER
				+ ", DELTA_AMOUNT=" + DELTA_AMOUNT + ", ADAS_ACC_VALUE_BEFORE=" + ADAS_ACC_VALUE_BEFORE
				+ ", ADAS_ACC_VALUE_AFTER=" + ADAS_ACC_VALUE_AFTER + ", ADAS_ADJUSTMENT_AMOUNT="
				+ ADAS_ADJUSTMENT_AMOUNT + ", ADS_ACCUM_VALUE_BEFORE=" + ADS_ACCUM_VALUE_BEFORE
				+ ", ADS_ACCUM_VALUE_AFTER=" + ADS_ACCUM_VALUE_AFTER + ", TDF=" + TDF + "]";
	}

}
