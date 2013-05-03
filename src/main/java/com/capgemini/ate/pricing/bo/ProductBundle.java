package com.capgemini.ate.pricing.bo;

public class ProductBundle {
	
	private String consumerBundleEANCode;
	private String consumerUnitEANCode;
	private int unitsPerBundle;
	
	public String getConsumerBundleEANCode() {
		return consumerBundleEANCode;
	}
	
	public void setConsumerBundleEANCode(String consumerBundleEANCode) {
		this.consumerBundleEANCode = consumerBundleEANCode;
	}
	
	public String getConsumerUnitEANCode() {
		return consumerUnitEANCode;
	}
	
	public void setConsumerUnitEANCode(String consumerUnitEANCode) {
		this.consumerUnitEANCode = consumerUnitEANCode;
	}
	
	public int getUnitsPerBundle() {
		return unitsPerBundle;
	}
	
	public void setUnitsPerBundle(int unitsPerBundle) {
		this.unitsPerBundle = unitsPerBundle;
	}
	
	
	
}