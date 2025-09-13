package com.api.test;

import org.testng.annotations.Test;

import com.api.base.UserAuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class UserLoginTest {
	
	@Test
	public void loginTest() {
		
		LoginRequest loginRequest = new LoginRequest("dheeraj1234", "Nrjshrm@4176");
		UserAuthService userauthservice = new UserAuthService();
		Response response = userauthservice.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		
	}

}
