import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetWeatherBody {
	
	@Test
	public void getWeatherBody()
	{
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response= httpRequest.get("/Hyderabad");
		
		ResponseBody body= response.getBody();
		String bodyAsString= body.asString();
		Assert.assertEquals(bodyAsString.contains("Hyderabad"), true, "Response body contains Hyderabad");
		System.out.println("Response body is :"+ bodyAsString);
		
	}

}
