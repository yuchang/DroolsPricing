package com.capgemini.ate.pricing.bo;

import java.util.Date;

public class Sales {
	
	private String invoiceUnitEANCode;
	private int unitsSold;
	private float turnover;
	private float margin;
	private Date lastUpdate;
	
	public String getInvoiceUnitEANCode() {
		return invoiceUnitEANCode;
	}
	
	public void setInvoiceUnitEANCode(String invoiceUnitEANCode) {
		this.invoiceUnitEANCode = invoiceUnitEANCode;
	}
	
	public int getUnitsSold() {
		return unitsSold;
	}
	
	public void setUnitsSold(int unitsSold) {
		this.unitsSold = unitsSold;
	}
	
	public float getTurnover() {
		return turnover;
	}
	
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	
	public float getMargin() {
		return margin;
	}
	
	public void setMargin(float margin) {
		this.margin = margin;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}