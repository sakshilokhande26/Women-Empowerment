package com.lti.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;



@Entity(name="hostel")
@Table(name="HOSTELREG")
public class Hostel {

	@Id
	@Column(name="USERNAME")
	private String userName;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@DateTimeFormat(pattern="yyyy-MM-dd", iso=ISO.DATE)
	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name="CONTACT_NO")
	private int contactNo;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="INCOME")
	private int income;
	@Column(name="MARITAL_STATUS")
	private String maritalStatus;
	@Column(name="CHILDREN")
	private int children;
	@Column(name="CHILD_GENDER")
	private String childGender;
	@Column(name="DESIG")
	private String desig;
	@Column(name="PDC")
	private String pdc;
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
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public String getChildGender() {
		return childGender;
	}
	public void setChildGender(String childGender) {
		this.childGender = childGender;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getPdc() {
		return pdc;
	}
	public void setPdc(String pdc) {
		this.pdc = pdc;
	}
	public Hostel() {
	System.out.println("Object Created");
	}
	@Override
	public String toString() {
		return "Hostel [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", contactNo=" + contactNo + ", address=" + address + ", income=" + income + ", maritalStatus="
				+ maritalStatus + ", children=" + children + ", childGender=" + childGender + ", desig=" + desig
				+ ", pdc=" + pdc + "]";
	}
	
}
