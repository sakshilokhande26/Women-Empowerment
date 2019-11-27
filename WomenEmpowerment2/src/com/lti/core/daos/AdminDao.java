package com.lti.core.daos;

import java.util.List;

import com.lti.core.entities.Admin;
import com.lti.core.entities.Courses;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;


public interface AdminDao {
	//Login Admin
	public Admin getAdminByUserName(String userName); 
	
	// show NGO
	public List<NgoReg> readNgoRegistration();
	
	// Approve NGO
	public int approveNgo(int ngoId);
	
	//Reject NGO
	public int rejectNgo(int ngoId);
	
	//Show Trainees courses opted by them
	public List<StepDetails> readTraineeDetails(); 
	
	
	
	}
