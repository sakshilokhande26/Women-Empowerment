package com.lti.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.daos.UserDao;
import com.lti.core.entities.Courses;
import com.lti.core.entities.Hostel;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.entities.User;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public boolean joinNewUser(User user) {
		
		int result = getUserDao().addNewUser(user);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public boolean joinNewEntry(Hostel hostel) {
		int result = getUserDao().addNewEntry(hostel);
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
	public boolean joinNewTrainee(StepDetails stepDetails) {
		int result = getUserDao().addNewTrainee(stepDetails);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<NgoDetails> findNgoDetails() {
		List<NgoDetails> list = getUserDao().readNgoDetails();
		return list;
	}



	@Override
	public User loginUser(String userName) {
		User user1 = new User();
		user1=userDao.getUserByUserName(userName);
		return user1;
	}

	@Override
	public List<Courses> findCourses() {
		List<Courses> list = getUserDao().readCourses();
		return list;
	}

	

	}

