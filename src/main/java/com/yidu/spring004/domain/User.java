package com.yidu.spring004.domain;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 9052175857826509118L;

	private String userId;
	private String userName;
	private String password;
	private String phoneNum;
	private String isUsable;
	private String userDesc;
	
	public Role role;
	
	public User() {
		super();
	}

	public User(String userId, String userName, String password, String phoneNum, String isUsable, String userDesc,
			Role role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNum = phoneNum;
		this.isUsable = isUsable;
		this.userDesc = userDesc;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getIsUsable() {
		return isUsable;
	}

	public void setIsUsable(String isUsable) {
		this.isUsable = isUsable;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isUsable == null) ? 0 : isUsable.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((userDesc == null) ? 0 : userDesc.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (isUsable == null) {
			if (other.isUsable != null)
				return false;
		} else if (!isUsable.equals(other.isUsable))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNum == null) {
			if (other.phoneNum != null)
				return false;
		} else if (!phoneNum.equals(other.phoneNum))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (userDesc == null) {
			if (other.userDesc != null)
				return false;
		} else if (!userDesc.equals(other.userDesc))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	/*@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", phoneNum=" + phoneNum
				+ ", isUsable=" + isUsable + ", userDesc=" + userDesc + "]";
	}*/

	/*@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", phoneNum=" + phoneNum
				+ ", isUsable=" + isUsable + ", userDesc=" + userDesc + ", role=" + role + "]";
	}*/

	
	
	
}
