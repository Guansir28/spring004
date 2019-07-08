package com.yidu.spring004.dao;

import java.util.List;

import com.yidu.spring004.domain.UserTest;

public interface UserDao {

	public List<UserTest> findAllUser();
}
