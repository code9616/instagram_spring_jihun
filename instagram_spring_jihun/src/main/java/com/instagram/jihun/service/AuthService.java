package com.instagram.jihun.service;

import com.instagram.jihun.domain.user.User;
import com.instagram.jihun.web.dto.auth.SignupRequestDto;

public interface AuthService {
	public boolean checkUsername(String username);
	public boolean signup(SignupRequestDto signupRequestDto);
	public User signin(String username, String password);
}
