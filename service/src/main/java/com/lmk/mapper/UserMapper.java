package com.lmk.mapper;

import com.lmk.user.User;

import java.util.List;

public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	User loginByUserName(String username);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}