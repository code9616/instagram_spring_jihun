package com.instagram.jihun.domain.user;

public interface UserRepository {
	public int checkUsername(String username);
	public int signup(User user);
	public User getuserByUsername(String username);
}
