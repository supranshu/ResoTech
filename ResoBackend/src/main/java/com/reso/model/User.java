package com.reso.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String password;
	private String role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userid, String username, String password, String role) {
		super();
		this.id = userid;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public long getUserid() {
		return id;
	}
	public void setUserid(long userid) {
		this.id = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userid=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
