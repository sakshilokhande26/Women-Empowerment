package com.lti.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity(name="User")
@Table(name="USERREG")
public class User {

	@Id
	@Column(name="USERNAME")
	private String userName;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="DOB")
	private Date dob;
	@Column(name="PASSWORD")
	private String pass;
	@Column(name="CONTACT_NO")
	private long contactNo;
	
	public User() {
		super();
	}

	public User(String userName, String firstName, String lastName, Date dob, String pass, long contactNo) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", pass=" + pass + ", contactNo=" + contactNo + "]";
	}
	
	
	
	
}
