package com.howtodoinjava.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherMain {
	private double temp;
	private int pressure;
	private int humidity ;
	private double temp_min;
	private double temp_max ;
	
	public WeatherMain(double temp, int pressure, int humidity, double temp_min, double temp_max){
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		this.temp_min = temp_min;
		this.temp_max = temp_max ;
	}
	
	public WeatherMain(){
		
	}
    
    
    
    @Override
    public String toString() {
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append("{");
    	strBuilder.append("temp:"+temp+",");
    	strBuilder.append("pressure:"+pressure+",");
    	strBuilder.append("humidity:"+ humidity+",");
    	strBuilder.append("temp_min:" + temp_min+",");
    	strBuilder.append("temp_max:"+ temp_max);
    	strBuilder.append("}");
        return strBuilder.toString();
    }
    
    public double getTemp() {
		return temp;
	}



	public void setTemp(double temp) {
		this.temp = temp;
	}



	public int getPressure() {
		return pressure;
	}



	public void setPressure(int pressure) {
		this.pressure = pressure;
	}



	public int getHumidity() {
		return humidity;
	}



	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}



	public double getTemp_min() {
		return temp_min;
	}



	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}



	public double getTemp_max() {
		return temp_max;
	}



	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

}
