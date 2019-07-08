package com.yidu.spring004.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yidu.spring004.domain.User;

public class UserController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//封装了模型视图的对象
		ModelAndView mav = new ModelAndView();
		//添加模型数据  request.setAttribute();
		mav.addObject("userList",initModel());
		mav.addObject("msg","honey,good afternoon!");
		//设置视图  request.getRequestDispatcher().forward()
		mav.setViewName("index.jsp");
		return mav;
	}
	
	public List<User> initModel(){
		List<User> userList = new ArrayList<User>();
		for(int i=0; i<10; i++){
			User user= new User();
			user.setUserId("u000001"+i);
			user.setUserName("张"+i);
			userList.add(user);
		}
		return userList;
	}
}
