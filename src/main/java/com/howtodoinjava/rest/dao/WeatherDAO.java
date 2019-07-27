package com.howtodoinjava.rest.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate ;

import com.howtodoinjava.rest.model.CityLocation;
import com.howtodoinjava.rest.model.WeatherData;
import com.howtodoinjava.rest.model.ZipCodes;
import com.howtodoinjava.rest.model.WeatherDataCollection;
import com.howtodoinjava.rest.model.WeatherDataPerZipcode;
import com.howtodoinjava.rest.config.WeatherConfig ;

@Repository
public class WeatherDAO 
{
    private ArrayList<String> zipcodeList;
    
    @Autowired
    private WeatherConfig apiConfig ;
        
    public void convertToZipCodeList(CityLocation city){
    	RestTemplate restTemplate = new RestTemplate();
    	String name = city.getName();
    	String state = city.getState();
    	String zipcodeKey = apiConfig.getZipcodeAPIKey();
    	System.out.println("zipcode key="+ zipcodeKey);
    	//PQ6p62tkFmSzBksnSUC36WhBWLHNbdLhY3BGYNA6ZbCHA7D4dk6juAFTEMxlHg6T
    	String url = "https://www.zipcodeapi.com/rest/"+zipcodeKey+"/city-zips.json/"+name+"/"+state;
    	ZipCodes zipCodes = restTemplate.getForObject(url,  ZipCodes.class);
    	zipcodeList = zipCodes.getZip_codes();
    }
    
    public ArrayList<String> getZipcodeList(){
    	return zipcodeList;
    }
    
    public ArrayList<WeatherDataPerZipcode> queryWeatherAPI(){
    	RestTemplate restTemplate = new RestTemplate();
    	
    	ArrayList<WeatherDataPerZipcode> responseData = new ArrayList<WeatherDataPerZipcode>();
    	
    	System.out.println("zipcode size:"+ zipcodeList.size());
    	
    	int i = 0;
    	for(String oneZipcode : zipcodeList){
    		//String oneZipcode = zipcodeList.get(0);
    		i++;
    		System.out.println("queried zip code:"+ i);
    		try{
    			String weatherKey = apiConfig.getWeatherAPIKey();
    			//c8e1a4a7ac5567fa9783d3b15eea9a9d
    			String url = "http://api.openweathermap.org/data/2.5/forecast?zip="+oneZipcode+"&APPID="+weatherKey;
    			WeatherDataCollection weatherDataCol = restTemplate.getForObject(url,  WeatherDataCollection.class);
    			ArrayList<WeatherData> allData = weatherDataCol.getList();
    			System.out.println("queried one zip code");
    		
    			WeatherData currentData = allData.get(0);
    			ArrayList<WeatherData> forecastData = new ArrayList<WeatherData>(allData.subList(1, allData.size()));
    			WeatherDataPerZipcode dataPerZipcode = new WeatherDataPerZipcode(oneZipcode, currentData, forecastData);
    		
    			responseData.add(dataPerZipcode);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    	
    	System.out.println("responseData size:"+ responseData.size());
    	return responseData;
    }
    
    
}