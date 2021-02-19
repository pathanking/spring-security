package com.cts.service;

import com.cts.entity.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}