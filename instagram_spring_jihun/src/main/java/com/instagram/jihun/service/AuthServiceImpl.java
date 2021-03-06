package com.instagram.jihun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.jihun.domain.user.User;
import com.instagram.jihun.domain.user.UserRepository;
import com.instagram.jihun.web.dto.auth.SignupRequestDto;

@Service
public class AuthServiceImpl implements AuthService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean checkUsername(String username) {
		return userRepository.checkUsername(username) !=0 ? true : false;
	}
	
	@Override
	public boolean signup(SignupRequestDto signupRequestDto) {
		int result = userRepository.signup(signupRequestDto.toEntity());
		return false;
	}
	
	/*
	 * @Override public User signin(String username, String password) {
	 * 
	 * return null; }
	 */
}
