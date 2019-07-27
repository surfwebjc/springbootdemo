# springbootdemo
#simple restful service project

Source code is available at GitHub: https://github.com/surfwebjc/springbootdemo/tree/dev

Build and launch rest service.
1)unzip the source zip file to c:\dev
2)cd C:\dev\springbootrestdemo
3)Dockerfile.bat

Test client with your SoapUI or other rest service client APP.

URL: http://localhost:3000/weather/
use post method, and send city location as "application/json" like the followings:

{
	"name": "San Jose",
	"state": "CA"
}

Test client with Junit test in the project
1)import the source code as Maven project in eclipse or other IDE. 
2)run the junit test case  com.howtodoinjava.demo.WeatherRestTest under src/test/java

Note: the zipcode API application key and weather API application key are defined at src/main/resources/application.properties as the followings:

api.zipcode.key=PQ6p62tkFmSzBksnSUC36WhBWLHNbdLhY3BGYNA6ZbCHA7D4dk6juAFTEMxlHg6T
api.weather.key=c8e1a4a7ac5567fa9783d3b15eea9a9d

The keys are valid for 7 days from 07/25/2019, and please replace them with new keys from the web sites if they are invalid.

https://www.zipcodeapi.com/API#locToZips

https://openweathermap.org/