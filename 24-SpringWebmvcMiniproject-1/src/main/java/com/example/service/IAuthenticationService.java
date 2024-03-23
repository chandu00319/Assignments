package com.example.service;

public class IAuthenticationService implements AuthenticationService {

	@Override
	public String authenticate(String username, String password) {
		
		return password;
		
		
	}

}
