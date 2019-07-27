# springbootdemo
#simple restful service project

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