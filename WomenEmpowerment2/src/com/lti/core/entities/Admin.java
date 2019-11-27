package com.lti.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity(name="Admin")
@Table(name="ADMINREGI")
public class Admin {

	@Id
	@Column(name="USERNAME")
	private String userName;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="PASSWORD")
	private String pass;
	@Column(name="CONTACT_NO")
	private int contactNo;
	
	
	public Admin() {
		super();
	}


	public Admin(String userName, String firstName, String lastName, String pass, int contactNo) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pass = pass;
		this.contactNo = contactNo;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public int getContactNo() {
		return contactNo;
	}


	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", pass=" + pass
				+ ", contactNo=" + contactNo + "]";
	}


	
	
}
