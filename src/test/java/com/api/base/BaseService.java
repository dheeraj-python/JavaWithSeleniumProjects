package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	//This class is responsible to handle 'BaseURL', 'Creating the Request', 'Handling the Response'.
	
	//Here BaseURL should be in Uppercase becasue constant will be in upper case & if anything in the uppercase then it shoudl be segreagted with final & static keyword.
	
	private static final String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestspecification;
	
	public BaseService() {
		
		requestspecification = RestAssured.given().baseUri(BASE_URL);
		
	}
	//setting the token
	protected void setAuthToken(String token) {
		requestspecification.header("Authorization", "Bearer " + token);
	}
	//Creating Get request
	protected Response getRequest(String endpoint) {
		return requestspecification.get(endpoint);
	}
	//here we need three things to made post request - payload, endpoint & header.
	protected Response postRequest(Object payload, String endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

}
