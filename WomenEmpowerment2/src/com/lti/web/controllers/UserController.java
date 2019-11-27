package com.lti.web.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.entities.Admin;
import com.lti.core.entities.Courses;
import com.lti.core.entities.Hostel;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.User;
import com.lti.core.services.AdminServices;
import com.lti.core.services.UserServices;

@Controller
public class UserController {
	@Autowired
	private UserServices userServices; 
	
	
	@RequestMapping(path="/userLogin.do")
	public String homePage() {
		return "UserLogin";
	}
	
	
//insertion pages-----------------------------------------------------------------------------
	
	//User Registration
	//http://localhost:8082/WomenEmpowerment2/userSignup.do
	@RequestMapping(path="userSignup.do", method=RequestMethod.GET)
	public String userSignupPage(){
		return "UserSignup";
	}
	
	@RequestMapping(path="userSignup.do", method=RequestMethod.POST)
	public String addNewUser(@RequestParam("userName") String userName,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName, @RequestParam("password") String password,@RequestParam("contactNo") long contactNo){
	
	User user = new User();	
	user.setUserName(userName);
	user.setFirstName(firstName);
	user.setLastName(lastName);
	java.util.Date dob = new java.util.Date();
	user.setDob(dob);
	user.setPass(password);
	user.setContactNo(contactNo);
		
		boolean result = userServices.joinNewUser(user);
		if(result){
			return "AfterLogin";
		}
		return "Error";
	}
	
	
	//Hostel Registration
	//http://localhost:8082/WomenEmpowerment2/hostelReg.do
	@RequestMapping(path="hostelReg.do", method=RequestMethod.GET)
	public String hostelRegPage(){
		return "HostelReg";
	}
	
	@RequestMapping(path="hostelReg.do", method=RequestMethod.POST)
	public String addNewEntry(@RequestParam("userName") String userName,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName, @RequestParam("dob") Date dob,@RequestParam("contactNo") int contactNo,@RequestParam("address") String address, @RequestParam("income") int income, @RequestParam("maritalStatus") String maritalStatus, @RequestParam("children") int children, @RequestParam("childGender") String childGender, @RequestParam("desig") String desig, @RequestParam("pdc") String pdc ){
		Hostel hostel = new Hostel();
		hostel.setUserName(userName);
		hostel.setFirstName(firstName);
		hostel.setLastName(lastName);
		hostel.setDob(dob);
		hostel.setContactNo(contactNo);
		hostel.setMaritalStatus(maritalStatus);
		hostel.setIncome(income);
		hostel.setChildren(children);
		hostel.setChildGender(childGender);
		hostel.setDesig(desig);
		hostel.setPdc(pdc);
		hostel.setAddress(address);
		
		boolean result = userServices.joinNewEntry(hostel);
		if(result){
			return "redirect:hostelReg.do";
		}
		return "Error";
	}
	
	
	
	
	//STEP Registration 
	//http://localhost:8082/WomenEmpowerment2/stepDetails.do
	@RequestMapping(path="stepDetails.do", method=RequestMethod.GET)
	public String stepDetailsPage(){
		return "StepDetails";
	}
	
	@RequestMapping(path="stepDetails.do", method=RequestMethod.POST)
	public String addNewTrainee(@RequestParam("userName") String userName,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName, @RequestParam("dob") Date dob,@RequestParam("contactNo") int contactNo,@RequestParam("email") String email, @RequestParam("address") String address, @RequestParam("nationality") String nationality ,@RequestParam("qualification") String qualification,@RequestParam("fatherName")String fatherName, @RequestParam("fOccupation") String fOccupation,@RequestParam("motherName")String motherName,@RequestParam("mOccupation") String mOccupation, @RequestParam("sAge")  int sAge,@RequestParam("sOccupation") String sOccupation, @RequestParam("ngoId")  int ngoId ,@RequestParam("course") String course){
		
		
		StepDetails stepDetails=new StepDetails();
		stepDetails.setUserName(userName);
		stepDetails.setFirstName(firstName);
		stepDetails.setLastName(lastName);
		stepDetails.setDob(dob);
		stepDetails.setContactNo(contactNo);
		stepDetails.setEmail(email);
		stepDetails.setAddress(address);
		stepDetails.setNationality(nationality);
		stepDetails.setQualification(qualification);
		stepDetails.setFatherName(fatherName);
		stepDetails.setfOccupation(fOccupation);
		stepDetails.setMotherName(motherName);
		stepDetails.setmOccupation(mOccupation);
		stepDetails.setsAge(sAge);
		stepDetails.setsOccupation(sOccupation);
		stepDetails.setNgoId(ngoId);
		stepDetails.setCourse(course);
		
		
		boolean result = userServices.joinNewTrainee(stepDetails);
		if(result){
			return "redirect:hostelReg.do";
		}
		return "Error";
	}
	

	//end of insertion pages-----------------------------------------


//Show Details of Ngo----------------------------------------------------
	//http://localhost:8082/WomenEmpowerment2/showNgoDetails.do
@RequestMapping(path="showNgoDetails.do", method=RequestMethod.GET)
	public String showNgoDetails(Model model){
		List<NgoDetails> list = userServices.findNgoDetails();
		model.addAttribute("ngoList", list);
		return "ShowNgoDetails";
	}
	
//Show Courses
	//http://localhost:8082/WomenEmpowerment2/showCourses.do
	@RequestMapping(path="showCourses.do", method=RequestMethod.GET)
public String showCourses(Model model){
	List<Courses> list = userServices.findCourses();
	model.addAttribute("CourseList", list);
	return "ShowCourses";
}
	
	
// Login Validation----------------------------------------------------------
	
	//http://localhost:8082/WomenEmpowerment2/userLogin.do
	@RequestMapping(path="userLogin.do", method=RequestMethod.GET)
	public String ValidateLogin(){
		return "UserLogin";
	}
	
	@RequestMapping(path="userLogin.do", method=RequestMethod.POST)
	public String login(@RequestParam("userName") String userName ,@RequestParam("pass")String password,HttpSession session,HttpServletRequest request)
	{
		User user = userServices.loginUser(userName);
		
		if(user.getPass().contentEquals(password)) {
			return "AfterLogin";
		}
		else {
			return "UserLogin";
		}
		                                                                                                                                                                          
}
	
@RequestMapping("/about.do")
public ModelAndView about() {
	return new ModelAndView("About.jsp",new HashMap<>());
}

@RequestMapping("/afterlogin.do")
public ModelAndView afterLogin() {
	return new ModelAndView("AfterLogin.jsp",new HashMap<>());
}
	
}