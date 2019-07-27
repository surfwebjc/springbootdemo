package com.howtodoinjava.rest.model;

import java.util.ArrayList;

public class WeatherDataPerZipcode {
	private String zipcode;
	private WeatherData currentWeather;
	private ArrayList<WeatherData> forecastWeather;
	
	public WeatherDataPerZipcode(String zipcode, WeatherData currentWeather, ArrayList<WeatherData> forecastWeather){
		this.zipcode = zipcode;
		this.currentWeather = currentWeather;
		this.forecastWeather = forecastWeather;
		
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public WeatherData getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(WeatherData currentWeather) {
		this.currentWeather = currentWeather;
	}

	public ArrayList<WeatherData> getForecastWeather() {
		return forecastWeather;
	}

	public void setForecastWeather(ArrayList<WeatherData> forecastWeather) {
		this.forecastWeather = forecastWeather;
	}
	
	@Override
	public String toString(){
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("{");
		strBuilder.append("zipcode:"+zipcode+",");
		strBuilder.append("current weather:"+ currentWeather.toString()+",");
		WeatherDataCollection weatherCol = new WeatherDataCollection();
		weatherCol.setList(forecastWeather);
		strBuilder.append("foreast wether:"+weatherCol.toString());
		strBuilder.append("}");
		return strBuilder.toString();
	}

}
