package com.api.test;

import org.testng.annotations.Test;

import com.api.base.UserAuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class UserAccountCreationTest {
	
	@Test
	public void createuseraccount() {
		
		
		//In builder design pattern, we directly call the class name because class name is static & call the Builder methods & it''s instance variables.
		//Benefits of the BDP is we can arrange the parameters in any order.
		SignupRequest signuprequest = new SignupRequest.Builder().username("dheerajone27").lastName("Verma")
		.firstName("Dheeraj").email("dheeraj.one27@gmail.com")
		.mobileNumber("97188522389").password("dheeraj2727").confirmpassword("dheeraj2727").build();
		
		UserAuthService authservice = new UserAuthService();
		Response response = authservice.Signup(signuprequest);
		System.out.println(response.asPrettyString());
	}

}
