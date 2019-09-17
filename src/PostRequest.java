import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.cliftonlabs.json_simple.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	
	@Test
	public void postRequestCust() {
	
		  RestAssured.baseURI="http://restapi.demoqa.com/customer";
		  RequestSpecification request=RestAssured.given(); JsonObject requestparams=
		  new JsonObject(); requestparams.put("First Name", "Suman");
		  requestparams.put("Last Name", "Sharma"); requestparams.put("User Name",
		  "13Suman"); requestparams.put("Email", "suman25@gmail.com");
		  
		  request.headers("Content-Type", "application/json");
		  request.body(requestparams.toJson()); Response response =
		  request.post("/register"); int statusCode = response.getStatusCode();
		  Assert.assertEquals(statusCode, "201"); String successCode =
		  response.jsonPath().get("SuccessCode"); Assert.assertEquals(
		  "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
		 
		
	}

}
