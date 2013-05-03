package com.capgemini.ate.pricing.bo;

public class AlignmentPolicy {
	
	private Competitor competitor;
	private String strategy;
	private String category;
	
	public Competitor getCompetitor() {
		return competitor;
	}
	
	public void setCompetitor(Competitor competitor) {
		this.competitor = competitor;
	}
	
	public String getStrategy() {
		return strategy;
	}
	
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

}