package com.instagram.jihun.web.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignupRequestDto {
	private String phoneOrEmail;
	private String name;
	private String username;
	private String password;
}
