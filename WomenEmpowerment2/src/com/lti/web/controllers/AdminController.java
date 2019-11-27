package com.lti.web.controllers;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.Admin;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.services.AdminServices;

@Controller
public class AdminController {
	
	@Autowired
	private AdminServices adminServices;
	
	//ADMIN DASHBOARD--------------------------------------------------------
	
		//Admin Login
		//http://localhost:8082/WomenEmpowerment2/adminLogin.do
		@RequestMapping(path="adminLogin.do", method=RequestMethod.GET)
		public String ValidateAdminLogin(){
			return "AdminLogin";
		}
		
		@RequestMapping(path="adminLogin.do", method=RequestMethod.POST)
		public String adminLogin(@RequestParam("userName") String userName ,@RequestParam("pass")String password, HttpSession session, HttpServletRequest request)
		{
			
			 
			Admin admin = adminServices.loginAdmin(userName);
			
			if(admin.getPass().contentEquals(password)) {
				System.out.println("inside pass");
				return "AdminDash";
			}
			else {
				return "UserLogin";
			}
	}
		@RequestMapping("adminDash.do")
		public ModelAndView adminDash() {
			return new ModelAndView("AdminDash",new HashMap<>());
		}
		
		//Ngo Status
		//http://localhost:8082/WomenEmpowerment2/showNgoRegistration.do
		@RequestMapping(path="showNgoRegistration.do", method=RequestMethod.GET)
			public String showNgoRegistration(Model model){
				List<NgoReg> list = adminServices.findNgoRegistration();
				model.addAttribute("ngoRegList", list);
				return "ShowNgoRegistration";
			}
		
		@RequestMapping(path="approveNgo.do",method=RequestMethod.GET)
		public String approveNgoRequest(@RequestParam("ngoId") int ngoId) {
			boolean result=adminServices.approveNgoStatus(ngoId);
			if(result)
				return"ShowStatus";
			else
				return"";
		}
		
		@RequestMapping(path="rejectNgo.do",method=RequestMethod.GET)
		public String rejectNgoRequest(@RequestParam("ngoId") int ngoId) {
			boolean result=adminServices.rejectNgoStatus(ngoId);
			if(result)
				return"ShowStatus";
			else
				return"";
		}
		
		//Show Details of Trainee----------------------------------------------------
		//http://localhost:8082/WomenEmpowerment2/showTraineeDetails.do
			@RequestMapping(path="showTraineeDetails.do", method=RequestMethod.GET)
		public String showTraineeDetails(Model model){
			List<StepDetails> list = adminServices.findTraineeDetails();
			model.addAttribute("traineeList", list);
			return "ShowTraineeDetails";
		}
}
