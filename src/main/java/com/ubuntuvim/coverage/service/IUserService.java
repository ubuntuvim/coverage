package com.ubuntuvim.coverage.service;

import com.ubuntuvim.coverage.domain.User;

public interface IUserService {
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public User getUser(String id);
}
