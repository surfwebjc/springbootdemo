package com.howtodoinjava.rest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value ;

@Configuration
public class WeatherConfig {
	@Value("${api.zipcode.key}") 
	private String zipcodeAPIKey;
	
    @Value("${api.weather.key}") 
    private String weatherAPIKey;

	public String getZipcodeAPIKey() {
		return zipcodeAPIKey;
	}

	public void setZipcodeAPIKey(String zipcodeAPIKey) {
		this.zipcodeAPIKey = zipcodeAPIKey;
	}

	public String getWeatherAPIKey() {
		return weatherAPIKey;
	}

	public void setWeatherAPIKey(String weatherAPIKey) {
		this.weatherAPIKey = weatherAPIKey;
	}
    
    

}
