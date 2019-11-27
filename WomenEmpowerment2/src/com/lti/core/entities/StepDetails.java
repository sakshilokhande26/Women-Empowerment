package com.lti.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity(name="StepDetails")
@Table(name="STEP_DETAILS")
public class StepDetails {
	@Id
	@Column(name="USERNAME")
     private String userName;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="DOB")
	private Date dob;
	@Column(name="CONTACT_NO")
	private int contactNo;
	@Column(name="EMAIL_ID")
	private String email;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="NATIONALITY")
    private String nationality;
	@Column(name="QUALIFICATION")
	private String qualification;
	@Column(name="FATHERS_NAME")
	private String fatherName;
	@Column(name="FOCCUPATION")
	private String fOccupation;
	@Column(name="MOTHERS_NAME")
	private String motherName;
	@Column(name="MOCCUPATION")
	private String mOccupation;
	@Column(name="SIBLING_AGE")
	private int sAge;
	@Column(name="SOCCUPATION")
	private String sOccupation;
	@Column(name="NGO_ID")
	private int ngoId;
	@Column(name="COURSE")
	private String course;
	
	public StepDetails(String userName, String firstName, String lastName, Date dob, int contactNo, String email,
			String address, String nationality, String qualification, String fatherName, String fOccupation,
			String motherName, String mOccupation, int sAge, String sOccupation, int ngoId, String course) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.contactNo = contactNo;
		this.email = email;
		this.address = address;
		this.nationality = nationality;
		this.qualification = qualification;
		this.fatherName = fatherName;
		this.fOccupation = fOccupation;
		this.motherName = motherName;
		this.mOccupation = mOccupation;
		this.sAge = sAge;
		this.sOccupation = sOccupation;
		this.ngoId = ngoId;
		this.course = course;
	}

	
	
	public StepDetails() {
		super();
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



	public int getContactNo() {
		return contactNo;
	}



	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getFatherName() {
		return fatherName;
	}



	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}



	public String getfOccupation() {
		return fOccupation;
	}



	public void setfOccupation(String fOccupation) {
		this.fOccupation = fOccupation;
	}



	public String getMotherName() {
		return motherName;
	}



	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}



	public String getmOccupation() {
		return mOccupation;
	}



	public void setmOccupation(String mOccupation) {
		this.mOccupation = mOccupation;
	}



	public int getsAge() {
		return sAge;
	}



	public void setsAge(int sAge) {
		this.sAge = sAge;
	}



	public String getsOccupation() {
		return sOccupation;
	}



	public void setsOccupation(String sOccupation) {
		this.sOccupation = sOccupation;
	}



	public int getNgoId() {
		return ngoId;
	}



	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	@Override
	public String toString() {
		return "StepDetails [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", contactNo=" + contactNo + ", email=" + email + ", address=" + address + ", nationality="
				+ nationality + ", qualification=" + qualification + ", fatherName=" + fatherName + ", fOccupation="
				+ fOccupation + ", motherName=" + motherName + ", mOccupation=" + mOccupation + ", sAge=" + sAge
				+ ", sOccupation=" + sOccupation + ", ngoId=" + ngoId + ", course=" + course + "]";
	}
	
	
	
	}
