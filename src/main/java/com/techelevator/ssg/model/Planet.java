package com.techelevator.ssg.model;

public class Planet {
	
	private String name;
	private double gravity;
	private double yearInEarthDays;
	private long averageDistance;
	
	Planet(String name, double gravity, double yearInEarthDays, long averageDistance){
		this.name = name;
		this.gravity = gravity;
		this.yearInEarthDays = yearInEarthDays;
		this.averageDistance = averageDistance;
	}
	
	public String getName() {
		return name;
	}
	public double getGravity() {
		return gravity;
	}
	public double getYearInEarthDays() {
		return yearInEarthDays;
	}
	public long getAverageDistance() {
		return averageDistance;
	}
	
	public String getImage() {
		return name.toLowerCase()+".jpg";
	}
	
	
	

}
