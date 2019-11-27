package com.lti.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.daos.AdminDao;
import com.lti.core.entities.Admin;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.entities.User;

@Service
public class AdminServicesImpl implements AdminServices {

	@Autowired
	private AdminDao adminDao ;
	
	
	

public AdminDao getAdminDao() {
	return adminDao;
}

public void setAdminDao(AdminDao adminDao) {
	this.adminDao = adminDao;
}

//Login validation---------------------------------------------------------------
@Override
@Transactional
public Admin loginAdmin(String userName) {
	Admin admin1 = new Admin();
	admin1=adminDao.getAdminByUserName(userName);
	return admin1;
}

//Status NGO----------------------------------------------------------------------
@Override
@Transactional
public List<NgoReg> findNgoRegistration() {
	List<NgoReg> list = getAdminDao().readNgoRegistration();
	for(NgoReg ngo:list) {
		System.out.println(ngo);
	}
	return list;
}

@Override
@Transactional
public boolean approveNgoStatus(int ngoId) {
	int result =adminDao.approveNgo(ngoId);
	if(result==1)
		 return true;
	else
	     return false;
}

@Override
@Transactional
public boolean rejectNgoStatus(int ngoId) {
	int result =adminDao.rejectNgo(ngoId);
	if(result==1)
		 return true;
	else
	     return false;
}


@Override
public List<StepDetails> findTraineeDetails() {
	List<StepDetails> list = getAdminDao().readTraineeDetails();
	for(StepDetails step:list) {
		System.out.println(step);
	}
	return list;
}

}
