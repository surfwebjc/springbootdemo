package com.howtodoinjava.rest.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Wind {
	private double speed;
	private int deg;
	
	
	public Wind(double speed, int deg){
		this.speed = speed;
		this.deg = deg;		
	}
	
	public Wind(){
		
	}
    
    
    
    @Override
    public String toString() {
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append("{");
    	strBuilder.append("speed:"+speed+",");
    	strBuilder.append("deg:"+deg);    	
    	strBuilder.append("}");
        return strBuilder.toString();
    }



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public int getDeg() {
		return deg;
	}



	public void setDeg(int deg) {
		this.deg = deg;
	}
    
    
}
