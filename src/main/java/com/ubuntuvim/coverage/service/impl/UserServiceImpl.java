package com.ubuntuvim.coverage.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.ubuntuvim.coverage.domain.User;
import com.ubuntuvim.coverage.service.IUserService;

@Component
public class UserServiceImpl implements IUserService {
	
	private Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Override
	public User getUser(String id) {
		//为了简单直接创建一个用户对象，通常这部分是通过查询数据库获取
		User u = new User();
		u.setAge(20);
		u.setId("123");
		u.setUsername("ubuntuvim");
		
		logger.info("返回参数： = " + u);
		
		return u;
	}

}
