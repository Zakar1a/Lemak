package com.zakar1a.claim.dao;

import java.util.List;

import com.zakar1a.claim.model.Claim;

public interface ClaimDao {

	public boolean addEntity(Claim claim) throws Exception;
	public Claim getEntityById(long id) throws Exception;
	public List<Claim> getEntityList() throws Exception;
	public List<Claim> getEntityByNRIC() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
