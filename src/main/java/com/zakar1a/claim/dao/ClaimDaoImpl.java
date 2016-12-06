package com.zakar1a.claim.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.zakar1a.claim.model.Claim;

public class ClaimDaoImpl implements ClaimDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(Claim claim) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(claim);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public Claim getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Claim claim = (Claim) session.load(Claim.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return claim;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Claim> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Claim> claimList = session.createCriteria(Claim.class)
				.list();
		tx.commit();
		session.close();
		return claimList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Claim> getEntityByNRIC() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Claim> claimList = session.createCriteria(Claim.class)
				.list();
		tx.commit();
		session.close();
		return claimList;
	}
	
	@Override
	public boolean deleteEntity(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Claim.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

}
