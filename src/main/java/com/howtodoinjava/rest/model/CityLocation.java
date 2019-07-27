package com.howtodoinjava.rest.model;

import javax.validation.constraints.Size ;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class CityLocation {
	
	@NotEmpty
	@NotNull
	@Pattern(regexp="([a-z]|[A-Z])([a-z]|[A-Z]| )+")
	@Size(max=1023, message="city name should only contain less than 1024 alphabetical characters")
	private String name;
	
	@NotEmpty
	@NotNull
	@Pattern(regexp="([a-z]|[A-Z]){2}")
	@Size(min=2, max=2, message="state should only contain 2 alphabetical characters")
	private String state;

    public CityLocation(String name, String state) {
    	super();
    	this.name = name;
    	this.state = state;
    }
    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

    
    @Override
    public String toString() {
        return "City [name="+name+", state = "+ state +"]";
    }




	
}

