package com.thymeleaf.mvc.model;

import java.util.List;

public class User {
	private String username;
	private String firstname;
	private String lastname;
	private List<Profile> profiles;
	public User() {};
	public User(String username, String firstname, String lastname, List<Profile> profiles) {
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.profiles = profiles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
}
