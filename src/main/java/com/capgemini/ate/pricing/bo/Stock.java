package com.capgemini.ate.pricing.bo;

import java.util.Date;

public class Stock {
	
	private String consumerUnitEANCode;
	private int availableStockUnits;
	private Date lastUpdate;
	
	public String getConsumerUnitEANCode() {
		return consumerUnitEANCode;
	}
	
	public void setConsumerUnitEANCode(String consumerUnitEANCode) {
		this.consumerUnitEANCode = consumerUnitEANCode;
	}
	
	public int getAvailableStockUnits() {
		return availableStockUnits;
	}
	
	public void setAvailableStockUnits(int availableStockUnits) {
		this.availableStockUnits = availableStockUnits;
	}
	
	public Date getLastUpdate() {
		return lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}