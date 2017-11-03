package com.ml.model;

public class WeatherResult {
	private int day;
	private String weather;
	
	public WeatherResult(int day, String weather){
		this.day = day;
		this.weather = weather;			
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
}
