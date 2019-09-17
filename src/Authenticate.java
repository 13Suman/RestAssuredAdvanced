import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authenticate {
	
	@Test
	public void getAunthenticate()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
		 RequestSpecification request = RestAssured.given();
		 Response response = request.get();
		 System.out.println("Status code: " + response.getStatusCode());
		 System.out.println("Status message " + response.body().asString());
	}

}
