package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Courses")
@Table(name="COURSES")
public class Courses {

	@Id
	@Column(name="NGO_ID")
	int ngoId;
	@Column(name="ORG_NAME")
	String orgName;
	@Column(name="COURSE_NAME")
	String CourseName;
	@Column(name="COURSE_DESCRIPTION")
	String CourseDesc;
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
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourseDesc() {
		return CourseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		CourseDesc = courseDesc;
	}
	public Courses(int ngoId, String orgName, String courseName, String courseDesc) {
		super();
		this.ngoId = ngoId;
		this.orgName = orgName;
		CourseName = courseName;
		CourseDesc = courseDesc;
	}
	public Courses() {
		super();
	}
	@Override
	public String toString() {
		return "Courses [ngoId=" + ngoId + ", orgName=" + orgName + ", CourseName=" + CourseName + ", CourseDesc="
				+ CourseDesc + "]";
	}
	
	
}
