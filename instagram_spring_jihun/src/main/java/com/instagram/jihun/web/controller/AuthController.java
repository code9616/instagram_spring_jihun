package com.instagram.jihun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //테이블 유저(메퍼) 어스
public class AuthController {//1
	@RequestMapping(value="/auth/signup", method = RequestMethod.GET)
	public String getSignup(@RequestParam("username")String username) {
		System.out.println();
		
		return "auth/signup";
	}
}
