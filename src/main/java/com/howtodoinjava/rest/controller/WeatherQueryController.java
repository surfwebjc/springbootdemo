package com.howtodoinjava.rest.controller;

import org.springframework.stereotype.Controller;
import javax.validation.Valid ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.howtodoinjava.rest.dao.WeatherDAO;
import com.howtodoinjava.rest.model.CityLocation;

import com.howtodoinjava.rest.model.WeatherDataPerZipcode;


import java.util.ArrayList ;

@Controller
@RequestMapping(path = "/weather")
public class WeatherQueryController 
{
    @Autowired
    private WeatherDAO weatherDao;
    
        
    
    @RequestMapping(method = RequestMethod.POST, value="/", consumes = "application/JSON", produces = "application/json")    
    @ResponseBody    
    public ArrayList<WeatherDataPerZipcode> queryWeather(
                        @Valid @RequestBody CityLocation city) 
                 throws Exception 
    {       
        if(city == null){
        	throw new Exception("City location is empty.");
        }
        
    	weatherDao.convertToZipCodeList(city);
    	ArrayList<WeatherDataPerZipcode> result = weatherDao.queryWeatherAPI();
    	
    	System.out.println("Done with query.");    	
    	
    	return result;
    }
}

