package com.capgemini.ate.pricing.bo;

public class PriceLimitMax {
	
	private String eanCode;
	private float price;
	private String reason;
	
	public String getEanCode() {
		return eanCode;
	}
	
	public void setEanCode(String eanCode) {
		this.eanCode = eanCode;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}