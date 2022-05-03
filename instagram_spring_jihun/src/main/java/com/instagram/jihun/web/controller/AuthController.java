package com.instagram.jihun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.instagram.jihun.web.dto.auth.SignupRequestDto;

@Controller
public class AuthController {
	@RequestMapping(value="/auth/signup", method = RequestMethod.GET)
	public String getSignup(@RequestParam("username")String username) {
		System.out.println();
		
		return "auth/signup";
	}
	@ResponseBody
	@RequestMapping(value = "/auth/signup", method = RequestMethod.POST)
	public String signupSubmit(SignupRequestDto signupRequestDto) {
		boolean result = authService.signup(signupRequestDto);
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value = "/auth/username/check", method = RequestMethod.POST)
	public String usernameCheck(String username) {
		return Boolean.toString(authService.checkUsername(username));
	}
	
}
