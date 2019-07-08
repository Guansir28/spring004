package com.yidu.spring004.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yidu.spring004.biz.UserBiz;

@Controller
@RequestMapping("/sys/user")
public class UserController2{
	@Autowired
	private UserBiz userBiz;

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	@RequestMapping("/users")
	public ModelAndView doFindAllUser(){
		System.out.println("doFindAllUser");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/index");
		mav.addObject("userList",userBiz.findAllUser());
		return mav;
	}
	
	@RequestMapping("/user")
	public void doFindUserById(String userId){
		System.out.println("doFindUserById");
	}
	
	
	public void other(){
		System.out.println("没有加@RequestMapping的方法");
	}
	
}
