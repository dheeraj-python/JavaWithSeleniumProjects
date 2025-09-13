package com.api.test;

import org.testng.annotations.Test;

import com.api.base.UserAuthService;

import io.restassured.response.Response;

public class ForgetPasswordTest {
	
	@Test
	public void forgotpassword() {
		
		UserAuthService authservice = new UserAuthService();
		Response response =authservice.forgotPassword("dheerajofficial27@gmail.com");
		System.out.println(response.asPrettyString());
	}
	

}
