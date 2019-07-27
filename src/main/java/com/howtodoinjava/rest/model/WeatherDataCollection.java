package com.howtodoinjava.rest.model;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherDataCollection 
{
    private ArrayList<WeatherData> list;
    
    public WeatherDataCollection(){
    	
    }
    
    public ArrayList<WeatherData> getList() {
        if(list == null) {
        	list = new ArrayList<WeatherData>();
        }
        return list;
    }
 
    public void setList(ArrayList<WeatherData> list) {
        this.list = list;
    }
    
    @Override
    public String toString() {
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append("[");
    	int i = 0;
    	for( WeatherData data : list){
    		if(i > 0){
    			strBuilder.append(",");
    		}
    		strBuilder.append(data.toString());
    		i++;
    		
    	}
    	strBuilder.append("]");
        return strBuilder.toString();
    }
    
}

