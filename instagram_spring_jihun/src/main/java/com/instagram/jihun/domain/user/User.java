package com.instagram.jihun.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	public int usercode;
	public String phone;
	public String email;
	public String name;
	public String username;
	public String password;
	public String create_date;
	public String update_date;
}
