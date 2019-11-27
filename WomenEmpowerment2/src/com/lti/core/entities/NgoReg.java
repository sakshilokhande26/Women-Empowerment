package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity(name="NgoReg")
@Table(name="NGOREG")
public class NgoReg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NGO_SEQ")
    @SequenceGenerator(sequenceName = "ngo_seq", allocationSize = 1, name = "NGO_SEQ")
	@Column(name="NGO_ID")
	int ngoId;
	@Column(name="ORG_NAME")
	String orgName;
	@Column(name="APP_NAME")
	String appName;
	@Column(name="PAN_NO")
	String panNo;
	@Column(name="GENDER")
	String gender;
	@Column(name="DESIGNATION")
	String designation;
	@Column(name="EMAIL")
	String email;
	@Column(name="CONTACT_NO")
	int contactNo;
	@Column(name="WEBSITE")
	String website;
	@Column(name="ADDRESS")
	String address;
	@Column(name="STATUS")
	String status;

	public int getNgoId() {
		return ngoId;
	}
	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public NgoReg(String orgName, String appName, String panNo, String gender, String designation,
			String email, int contactNo, String website, String address) {
		super();
		
		this.orgName = orgName;
		this.appName = appName;
		this.panNo = panNo;
		this.gender = gender;
		this.designation = designation;
		this.email = email;
		this.contactNo = contactNo;
		this.website = website;
		this.address = address;
		this.status = "pending";
	}
	public NgoReg() {
		System.out.println("Object Created NGO");
	}
	
	

}
