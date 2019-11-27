package com.lti.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.Admin;
import com.lti.core.entities.Courses;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;
import com.lti.core.entities.StepDetails;
import com.lti.core.entities.User;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager entityManager;
//Login Admin----------------------------------
	@Override
	public Admin getAdminByUserName(String userName) {
		Query qry2 = entityManager.createQuery("select a from Admin a where a.userName= :userName");
		qry2.setParameter("userName", userName);		
		return (Admin)(qry2.getSingleResult());
	}

//Ngo Status-----------------------------------------------------------------
	@Override
	public List<NgoReg> readNgoRegistration() {
		String jpql = "From NgoReg";
		TypedQuery<NgoReg> tquery = entityManager.createQuery(jpql, NgoReg.class);
		List<NgoReg> list = tquery.getResultList();
        return list;
	}

@Override
public int approveNgo(int ngoId) {
	String jpql="Update NgoReg n SET n.status='Approved' where n.ngoId= :ngoId";
	Query qry=entityManager.createQuery(jpql);
	qry.setParameter("ngoId", ngoId);
	int result=qry.executeUpdate();
	return result;
}

@Override
public int rejectNgo(int ngoId) {
	String jpql="Update NgoReg n SET n.status='Rejected' where n.ngoId= :ngoId";
	Query qry=entityManager.createQuery(jpql);
	qry.setParameter("ngoId", ngoId);
	int result=qry.executeUpdate();
	return result;
}


//Trainee Details

@Override
public List<StepDetails> readTraineeDetails() {
	String jpql = "From StepDetails";
	TypedQuery<StepDetails> tquery = entityManager.createQuery(jpql, StepDetails.class);
	List<StepDetails> list = tquery.getResultList();
	return list;

}

}
