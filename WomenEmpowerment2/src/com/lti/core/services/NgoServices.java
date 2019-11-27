package com.lti.core.services;

import com.lti.core.entities.Courses;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;

public interface NgoServices {
	// Ngo Registration
		public int joinNewNgo(NgoReg ngoReg); 
		//Ngo Details
		public boolean joinNewNgoDets(NgoDetails ngoDetails);
		//Course Registration by Ngo
		public boolean joinNewCourse(Courses courses);
}
