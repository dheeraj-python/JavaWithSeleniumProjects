package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class UserAuthService extends BaseService{
	
	private static final String BASE_PATH = "/api/auth/";
	
	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
	}
	
	public Response Signup(SignupRequest payload) {
		return postRequest(payload, BASE_PATH + "signup");
		
	}
	
	public Response forgotPassword(String emailaddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailaddress);
		return postRequest(payload, BASE_PATH + "forgot-password");
		
	}

}
