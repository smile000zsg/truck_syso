package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Role {
	private int rid;
	private String rolename;
	private List<Users> users = new ArrayList<Users>();
	private List<UserRoleKey> usersrole;
	
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public List<UserRoleKey> getUsersrole() {
		return usersrole;
	}
	public void setUsersrole(List<UserRoleKey> usersrole) {
		this.usersrole = usersrole;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}
