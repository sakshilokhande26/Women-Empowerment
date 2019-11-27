package com.lti.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.core.entities.Admin;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;

public interface AdminServices {
	//Login Admin
	public Admin loginAdmin(String userName);
	
	//Show NGO
	public List<NgoReg> findNgoRegistration();
	
	//Approve NGO
	public boolean approveNgoStatus(int ngoId);
	
	//Reject NGO
	public boolean rejectNgoStatus(int ngoId);
	
	//Show Trainees 
		public List<StepDetails> findTraineeDetails();
	
}
