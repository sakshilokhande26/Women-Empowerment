package com.lti.core.services;

import java.util.List;

import com.lti.core.entities.Courses;
import com.lti.core.entities.Hostel;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.entities.User;

public interface UserServices {

	 //Registration User
	public boolean joinNewUser(User user);
	//Login user
	public User loginUser(String userName);
	 //Hostel Registration
	public boolean joinNewEntry(Hostel hostel);
	// Show different Ngos
	public List<NgoDetails> findNgoDetails();
	//Trainee Registration
	public boolean joinNewTrainee(StepDetails stepDetails);
	//Show Courses Registered by Ngo
	public List<Courses> findCourses();
}
