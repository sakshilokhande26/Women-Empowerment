package com.lti.core.daos;

import com.lti.core.entities.Courses;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;

public interface NgoDao {
	// Ngo Registration
		public int addNewNgo(NgoReg ngoReg); 
		//Ngo Details after approval
		public int addNewNgoDets(NgoDetails ngoDetails); 
		//Course Registration By Ngo
		public int addNewCourse(Courses courses);
}
