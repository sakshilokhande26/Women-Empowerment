package com.lti.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.Courses;
import com.lti.core.entities.Hostel;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.entities.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int addNewUser(User user) {
		
		entityManager.persist(user);
		return 1;
	}

	@Override
	public int addNewEntry(Hostel hostel) {
		entityManager.persist(hostel);
		return 1;
	}

	

	

	@Override
	public int addNewTrainee(StepDetails stepDetails) {
		entityManager.persist(stepDetails);
		return 1;
	}

	@Override
	public List<NgoDetails> readNgoDetails() {
		String jpql = "From NgoDetails";
		TypedQuery<NgoDetails> tquery = entityManager.createQuery(jpql, NgoDetails.class);
		List<NgoDetails> list = tquery.getResultList();
		return list;
	}

	

	@Override
	public User getUserByUserName(String userName) {
		Query qry2 = entityManager.createQuery("select u from User u where u.userName= :userName");
		qry2.setParameter("userName", userName);		
		return (User)(qry2.getSingleResult());
	}

	
	@Override
	public List<Courses> readCourses() {
		String jpql = "From Courses";
		TypedQuery<Courses> tquery = entityManager.createQuery(jpql,Courses.class);
		List<Courses> list = tquery.getResultList();
		return list;
	}

	

}
