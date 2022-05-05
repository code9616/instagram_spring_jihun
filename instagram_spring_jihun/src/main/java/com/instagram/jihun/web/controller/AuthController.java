package com.instagram.jihun.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.instagram.jihun.service.AuthService;
import com.instagram.jihun.web.dto.auth.SignupRequestDto;
import com.instagram.jihun.web.util.auth.AuthResponseScript;

@Controller
public class AuthController {
	
	@Autowired
	private AuthService authService; 
	
	/*
	 * @RequestMapping(value="/auth/signin", method = RequestMethod.GET) public
	 * String getSignin() { return "auth/signin"; }
	 * 
	 * @RequestMapping(value="/auth/signin", method = RequestMethod.POST) public
	 * String signinSubmit() { return "auth/signin"; }
	 */
	@RequestMapping(value="/auth/signup", method = RequestMethod.GET)
	public String getSignup(@RequestParam("username")String username) {
		return "auth/signup";
	}
	
	@ResponseBody
	@RequestMapping(value = "/auth/signup", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String signupSubmit(SignupRequestDto signupRequestDto) {
		boolean result = authService.signup(signupRequestDto);
		AuthResponseScript script = new AuthResponseScript();
		return script.signupScript(result);
	}
	
	@ResponseBody
	@RequestMapping(value = "/auth/username/check", method = RequestMethod.POST)
	public String usernameCheck(String username) {
		return Boolean.toString(authService.checkUsername(username));
	}
	
}
