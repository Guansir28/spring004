package com.yidu.spring004.biz;

import java.util.List;

import com.yidu.spring004.domain.UserTest;

public interface UserBiz {

	public List<UserTest> findAllUser();
	
	public UserTest findUserById(String userId);
}
