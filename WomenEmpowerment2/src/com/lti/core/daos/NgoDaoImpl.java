package com.lti.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.Courses;
import com.lti.core.entities.NgoDetails;
import com.lti.core.entities.NgoReg;

@Repository("ngoDao")
public class NgoDaoImpl implements NgoDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int addNewNgo(NgoReg ngoReg) {
		entityManager.persist(ngoReg);
		return ngoReg.getNgoId();
	}

	@Override
	public int addNewNgoDets(NgoDetails ngoDetails) {
		entityManager.persist(ngoDetails);
		return 1;
	}

	@Override
	public int addNewCourse(Courses courses) {
		entityManager.persist(courses);
		return 1;
	}


}
