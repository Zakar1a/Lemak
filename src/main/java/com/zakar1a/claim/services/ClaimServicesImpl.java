package com.zakar1a.claim.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zakar1a.claim.dao.ClaimDao;
import com.zakar1a.claim.model.Claim;

public class ClaimServicesImpl implements ClaimServices {

	@Autowired
	ClaimDao claimDao;
	
	@Override
	public boolean addEntity(Claim claim) throws Exception {
		return claimDao.addEntity(claim);
	}

	@Override
	public Claim getEntityById(long id) throws Exception {
		return claimDao.getEntityById(id);
	}

	@Override
	public List<Claim> getEntityList() throws Exception {
		return claimDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return claimDao.deleteEntity(id);
	}

}
