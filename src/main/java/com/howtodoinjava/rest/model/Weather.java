package com.howtodoinjava.rest.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Weather {
	private String main;
	private String description;
	
	
	public Weather(String main, String description){
		this.main = main;
		this.description = description;		
	}
	
	public Weather(){
		
	}
    
    
    
    @Override
    public String toString() {
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append("{");
    	strBuilder.append("main:"+main+",");
    	strBuilder.append("description:"+description);    	
    	strBuilder.append("}");
        return strBuilder.toString();
    }



	public String getMain() {
		return main;
	}



	public void setMain(String main) {
		this.main = main;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	    
    
}

