package com.howtodoinjava.rest.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ZipCodes {
	private ArrayList<String> zip_codes;
    
    public ArrayList<String> getZip_codes() {
        if(zip_codes == null) {
        	zip_codes = new ArrayList<>();
        }
        return zip_codes;
    }
 
    public void setZip_codes(ArrayList<String> zip_codes) {
        this.zip_codes = zip_codes;
    }
    
    @Override
    public String toString() {
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append("[");
    	int i = 0;
    	for( String zipcode : zip_codes){
    		if(i > 0){
    			strBuilder.append(",");
    		}
    		strBuilder.append(zipcode);
    		i++;
    		
    	}
    	strBuilder.append("]");
        return strBuilder.toString();
    }

}
