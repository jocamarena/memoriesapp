package com.thymeleaf.mvc.model;

import java.util.Date;


public class Profile {
	private Date datecreated;
	private String cellphone;
	private Boolean isValid;
	private User owner;
	public Profile() {};
	public Profile(Date datecreated, String cellphone, Boolean isValid, User owner) {
		this.datecreated = datecreated;
		this.cellphone = cellphone;
		this.isValid = isValid;
		this.owner = owner;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
}
