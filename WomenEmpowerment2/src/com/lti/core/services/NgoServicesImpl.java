package com.lti.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.daos.NgoDao;
import com.lti.core.daos.UserDao;
import com.lti.core.entities.Courses;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
@Service
public class NgoServicesImpl implements NgoServices {
	
	@Autowired
	private NgoDao ngoDao;

	public NgoDao getNgoDao() {
		return ngoDao;
	}



	public void setNgoDao(NgoDao ngoDao) {
		this.ngoDao = ngoDao;
	}



	@Override
	@Transactional
	public int joinNewNgo(NgoReg ngoReg) {
		return getNgoDao().addNewNgo(ngoReg);
		
	}



	@Override
	@Transactional
	public boolean joinNewNgoDets(NgoDetails ngoDetails) {
		int result = getNgoDao().addNewNgoDets(ngoDetails);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	@Transactional
	public boolean joinNewCourse(Courses courses) {
		int result = getNgoDao().addNewCourse(courses);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
	}

}
}
