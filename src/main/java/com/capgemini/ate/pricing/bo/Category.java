package com.capgemini.ate.pricing.bo;

public class Category {
	
	private String name;
	private String competitionLevel;
	private String sensitivity;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompetitionLevel() {
		return competitionLevel;
	}
	
	public void setCompetitionLevel(String competitionLevel) {
		this.competitionLevel = competitionLevel;
	}
	
	public String getSensitivity() {
		return sensitivity;
	}
	
	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}
	
}