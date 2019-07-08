package com.yidu.spring004.domain;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5202056654541550860L;
	
	private String roleId;
	private String roleName;
	private String roleAbbr;
	private String roleDesc;
	private String isUsable;
	//一对多属性
	private List<User> userList;
	
	public Role() {
		super();
	}

	public Role(String roleId, String roleName, String roleAbbr, String roleDesc, String isUsable,
			List<User> userList) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleAbbr = roleAbbr;
		this.roleDesc = roleDesc;
		this.isUsable = isUsable;
		this.userList = userList;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleAbbr() {
		return roleAbbr;
	}

	public void setRoleAbbr(String roleAbbr) {
		this.roleAbbr = roleAbbr;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getIsUsable() {
		return isUsable;
	}

	public void setIsUsable(String isUsable) {
		this.isUsable = isUsable;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isUsable == null) ? 0 : isUsable.hashCode());
		result = prime * result + ((roleAbbr == null) ? 0 : roleAbbr.hashCode());
		result = prime * result + ((roleDesc == null) ? 0 : roleDesc.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result + ((userList == null) ? 0 : userList.hashCode());
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
		Role other = (Role) obj;
		if (isUsable == null) {
			if (other.isUsable != null)
				return false;
		} else if (!isUsable.equals(other.isUsable))
			return false;
		if (roleAbbr == null) {
			if (other.roleAbbr != null)
				return false;
		} else if (!roleAbbr.equals(other.roleAbbr))
			return false;
		if (roleDesc == null) {
			if (other.roleDesc != null)
				return false;
		} else if (!roleDesc.equals(other.roleDesc))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		if (userList == null) {
			if (other.userList != null)
				return false;
		} else if (!userList.equals(other.userList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleAbbr=" + roleAbbr + ", roleDesc=" + roleDesc
				+ ", isUsable=" + isUsable + ", userList=" + userList + "]";
	}

	
}
