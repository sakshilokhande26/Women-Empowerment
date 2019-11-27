package com.lti.core.entities;

import javax.persistence.*;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity(name="NgoDetails")
@Table(name="NGO_DETAILS")
public class NgoDetails {
	@Id
	@Column(name="NGO_ID")
	int ngoId;
	@Column(name="ORG_NAME")
	private String orgName;
	@Column(name="ORG_OBJ")
	String orgObj;
	@Column(name="ORG_VISION")
	String orgVision;
	@Column(name="ORG_MISSION")
	String orgMission;
	@Column(name="ORG_PURPOSE")
	String orgPurpose;
	@Column(name="NO_OF_COURSES")
	int courseNo;
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
	public String getOrgObj() {
		return orgObj;
	}
	public void setOrgObj(String orgObj) {
		this.orgObj = orgObj;
	}
	public String getOrgVision() {
		return orgVision;
	}
	public void setOrgVision(String orgVision) {
		this.orgVision = orgVision;
	}
	public String getOrgMission() {
		return orgMission;
	}
	public void setOrgMission(String orgMission) {
		this.orgMission = orgMission;
	}
	public String getOrgPurpose() {
		return orgPurpose;
	}
	public void setOrgPurpose(String orgPurpose) {
		this.orgPurpose = orgPurpose;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
	public NgoDetails(int ngoId, String orgObj, String orgVision, String orgMission, String orgPurpose,
			int courseNo) {
		super();
		this.ngoId = ngoId;
		this.orgObj = orgObj;
		this.orgVision = orgVision;
		this.orgMission = orgMission;
		this.orgPurpose = orgPurpose;
		this.courseNo = courseNo;
	}
	public NgoDetails() {
		System.out.println("object created details");
	}
	@Override
	public String toString() {
		return "NgoDetails [ngoId=" + ngoId + ", orgObj=" + orgObj + ", orgVision=" + orgVision + ", orgMission="
				+ orgMission + ", orgPurpose=" + orgPurpose + ", courseNo=" + courseNo +  "]";
	}
	
	
	

}
