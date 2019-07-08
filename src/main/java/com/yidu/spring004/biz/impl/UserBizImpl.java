package com.yidu.spring004.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yidu.spring004.biz.UserBiz;
import com.yidu.spring004.dao.UserDao;
import com.yidu.spring004.domain.User;
import com.yidu.spring004.domain.UserTest;

@Component
@Service
public class UserBizImpl implements UserBiz{
	@Autowired
	private UserDao userDao;
	
	public UserBizImpl() {
		super();
	}

	
	public UserBizImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	public List<UserTest> findAllUser() {
		List<UserTest> utList = new ArrayList<UserTest>();
		utList = userDao.findAllUser();
		return utList;
	}

	public UserTest findUserById(String userId) {
		
		return null;
	}

}
