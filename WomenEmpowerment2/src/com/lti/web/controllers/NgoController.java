package com.lti.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.core.entities.Courses;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.services.NgoServices;

@Controller
public class NgoController {
	
	@Autowired
	private NgoServices ngoServices;
	
	//Ngo Registration
		//http://localhost:8082/WomenEmpowerment2/ngoReg.do
		@RequestMapping(path="ngoReg.do", method=RequestMethod.GET)
		public String ngoRegPage(){
			return "NgoReg";
		}
		
		@RequestMapping(path="ngoReg.do", method=RequestMethod.POST)
		public String addNewNgo(@RequestParam("orgName") String orgName,
				@RequestParam("appName") String appName,
				@RequestParam("panNo") String panNo,
				@RequestParam("gender") String gender,
				@RequestParam("designation") String designation,
				@RequestParam("email") String email, @RequestParam("contactNo") int contactNo, 
				@RequestParam("website") String website, 
				@RequestParam("address") String address,
				HttpSession session){
	           
			try {
			NgoReg ngoReg = new NgoReg(orgName, appName, panNo, gender, designation, email, contactNo, website, address);
			System.out.println("Org Name "+orgName);
			int ngoId= ngoServices.joinNewNgo(ngoReg);
			session.setAttribute("ngoId",ngoId);
			session.setAttribute("orgName", orgName);
			return "NgoDetails";
			}catch(Exception ex) {
				ex.printStackTrace();
				return "error";
			}
		}
		
		
		//Ngo Details
		//http://localhost:8082/WomenEmpowerment2/ngoDetails.do
		@RequestMapping(path="ngoDetails.do", method=RequestMethod.GET)
		public String ngoDetailsPage(){
			return "NgoDetails";
		}
		
		@RequestMapping(path="ngoDetails.do", method=RequestMethod.POST)
		public String addNewNgoDets(
					@RequestParam("orgObj") String orgObj,
					@RequestParam("orgVision") String orgVision, 
					@RequestParam("orgMission") String orgMission,
					@RequestParam("orgPurpose") String orgPurpose,
					@RequestParam("courseNo") int courseNo, HttpSession session){
		
			Object obj = session.getAttribute("ngoId");
			Object obj1 = session.getAttribute("orgName");
			int ngoId =0;
			if(obj!=null) {
				ngoId=Integer.parseInt(obj.toString());
			}
			
			NgoDetails ngoDetails = new NgoDetails(ngoId, obj1.toString(), orgVision, orgMission, orgPurpose, courseNo);
			
			ngoDetails.setOrgObj(orgObj);
			ngoDetails.setOrgVision(orgVision);
			ngoDetails.setOrgMission(orgMission);
			ngoDetails.setOrgPurpose(orgPurpose);
			ngoDetails.setCourseNo(courseNo);
			
			boolean result = ngoServices.joinNewNgoDets(ngoDetails);
			if(result){
				return "redirect:courses.do";
			}
			return "Error";
		}
		
		
		//Registration of courses
		@RequestMapping(path="courses.do", method=RequestMethod.GET)
		public String coursesPage(){
			return "Courses";
		}
		
		@RequestMapping(path="courses.do", method=RequestMethod.POST)
		public String addNewcourses(@RequestParam("courseName") String courseName,
					@RequestParam("courseDesc") String courseDesc, HttpSession session){
		
			Object obj = session.getAttribute("ngoId");
			
			Object obj1 = session.getAttribute("orgName");
			System.out.println("sess "+obj1);
			int ngoId =0;
			if(obj!=null) {
				ngoId=Integer.parseInt(obj.toString());
			}
			
			Courses courses = new Courses( ngoId, obj1.toString(),courseName, courseDesc);
						
			boolean result = ngoServices.joinNewCourse(courses);
			if(result){
				return "redirect:StepDetails.do";
			}
			return "Error";
		}
}
