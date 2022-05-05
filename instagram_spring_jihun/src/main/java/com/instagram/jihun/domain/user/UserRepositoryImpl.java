package com.instagram.jihun.domain.user;

import org.apache.ibatis.session.SqlSession;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	@Autowired
	private SqlSession session;
	
	private final String NAME_SPACE = "com.instagram.jihun.domain.user.UserRepository";
	
	@Override
	public int checkUsername(String username) {
		return session.selectOne(NAME_SPACE + "checkUsername", username);
	}
	
	@Override
	public User getuserByUsername(String username) {
		return session.selectOne(NAME_SPACE + "getuserByUsername", username);
	}
	
	@Override
	public int signup(User user) {
		System.out.println(BCrypt.checkpw("1234", user.getPassword()));
		return session.insert(NAME_SPACE + "signup", user);
	}
}
