package com.api.test;

import org.testng.annotations.Test;

import com.api.base.UserAuthService;
import com.api.base.UserProfileService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test(description = "Verify get profile details..")
	
	public void getProfileTest() {
		
		UserAuthService authservice = new UserAuthService();
		Response response =authservice.login(new LoginRequest("dheeraj1234", "Nrjshrm@4176"));
		LoginResponse loginResponse=response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		UserProfileService userservice = new UserProfileService();
		response =userservice.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
	}

}
