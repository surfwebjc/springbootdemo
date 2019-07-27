package com.howtodoinjava.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherData {
	private long dt;
	private WeatherMain main;
	private ArrayList<Weather> weather;
	private Wind wind;
	private String dt_txt ;
	
    
    public WeatherData(long dt, WeatherMain main, ArrayList<Weather> weather,  Wind wind, String dt_txt){
    	this.weather = weather;
    	this.main = main;
    	this.wind = wind;
    	this.dt = dt;
    	this.dt_txt = dt_txt ;
    }
    
    public WeatherData(){
    	
    }
    
    @Override
    public String toString() {
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append("{");
    	strBuilder.append("dt:"+ dt+",");
    	strBuilder.append("main:"+ main.toString()+",");
    	strBuilder.append("weather:[");
    	int i = 0;
    	for(Weather oneWeather : weather){
    		if(i >0){
    			strBuilder.append(",");
    		}
    		strBuilder.append( weather.toString());
    		i++;
    	}
    	strBuilder.append("],");
    	strBuilder.append("wind:"+ wind.toString() +",");
    	strBuilder.append("dt_txt:"+ dt_txt);
    	
    	strBuilder.append("}");
        return strBuilder.toString();
    }

	public ArrayList<Weather> getWeather() {
		return weather;
	}

	public void setWeather(ArrayList<Weather> weather) {
		this.weather = weather;
	}

	public WeatherMain getMain() {
		return main;
	}

	public void setMain(WeatherMain main) {
		this.main = main;
	}

	
	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public String getDt_txt() {
		return dt_txt;
	}

	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

}

