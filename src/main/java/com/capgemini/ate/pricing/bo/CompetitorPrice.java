package com.capgemini.ate.pricing.bo;

import java.util.Date;

public class CompetitorPrice {
	
	private String eanCode;
	private String competitor;
	private float price;
	private Date lastUpdate;
	
	public String getEanCode() {
		return eanCode;
	}
	
	public void setEanCode(String eanCode) {
		this.eanCode = eanCode;
	}
	
	public String getCompetitor() {
		return competitor;
	}
	
	public void setCompetitor(String competitor) {
		this.competitor = competitor;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Date getLastUpdate() {
		return lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}