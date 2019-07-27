package com.howtodoinjava.demo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.howtodoinjava.rest.model.CityLocation;

import com.howtodoinjava.rest.SpringBootDemoApplication;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT, classes = SpringBootDemoApplication.class)
public class WeatherRestTest 
{
    @Autowired
    private TestRestTemplate restTemplate;
    
    @LocalServerPort
    int randomServerPort;

    
    
    @Test
    public void testWeatherRest() throws URISyntaxException 
    {
        final String baseUrl = "http://localhost:"+randomServerPort+"/weather/";
        URI uri = new URI(baseUrl);
        CityLocation city = new CityLocation("Berkeley","CA");
        
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<CityLocation> request = new HttpEntity<CityLocation>(city, headers);
        
        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);
        System.out.println(result);        
        
        Assert.assertEquals(200, result.getStatusCodeValue());
        
    }

}
