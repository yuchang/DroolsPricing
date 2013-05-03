package com.capgemini.ate.pricing.bo;

public class Product {
	
	private String consumerUnitEANCode;
	private String invoiceUnitEANCode;
	private String name;
	private Brand brand;
	private Category category;
	private float price;
	private float measuredPrice;
	private float costPrice;
	private String promotionType;
	
	public String getConsumerUnitEANCode() {
		return consumerUnitEANCode;
	}
	
	public void setConsumerUnitEANCode(String consumerUnitEANCode) {
		this.consumerUnitEANCode = consumerUnitEANCode;
	}
	
	public String getInvoiceUnitEANCode() {
		return invoiceUnitEANCode;
	}
	
	public void setInvoiceUnitEANCode(String invoiceUnitEANCode) {
		this.invoiceUnitEANCode = invoiceUnitEANCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Brand getBrand() {
		return brand;
	}
	
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getMeasuredPrice() {
		return measuredPrice;
	}
	
	public void setMeasuredPrice(float measuredPrice) {
		this.measuredPrice = measuredPrice;
	}
	
	public float getCostPrice() {
		return costPrice;
	}
	
	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}
	
	public String getPromotionType() {
		return promotionType;
	}
	
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	
}