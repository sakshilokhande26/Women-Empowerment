package com.lti.core.daos;

import java.util.List;

import com.lti.core.entities.Courses;
import com.lti.core.entities.Hostel;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.entities.User;

public interface UserDao {
	//Registration User
	public int addNewUser(User user); 
	//Login user
	public User getUserByUserName(String userName); 
	//Hostel Registration
	public int addNewEntry(Hostel hostel); 
	// Show different Ngos
	public List<NgoDetails> readNgoDetails();
	//Trainee Registration
	public int addNewTrainee(StepDetails stepDetails); 
	
	//Show Courses
		public List<Courses> readCourses();
}
