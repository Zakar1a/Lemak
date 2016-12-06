package com.zakar1a.claim.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zakar1a.claim.model.Claim;
import com.zakar1a.employee.model.Status;
import com.zakar1a.claim.services.ClaimServices;

@Controller
@RequestMapping("/claim")
public class ClaimController {

	@Autowired
	ClaimServices claimServices;

	static final Logger logger = Logger.getLogger(ClaimController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addClaim(@RequestBody Claim claim) {
		try {
			claimServices.addEntity(claim);
			return new Status(1, "Claim added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Claim getClaim(@PathVariable("id") long id) {
		Claim claim = null;
		try {
			claim = claimServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return claim;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Claim> getClaim() {

		List<Claim> claimList = null;
		try {
			claimList = claimServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return claimList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteClaim(@PathVariable("id") long id) {

		try {
			claimServices.deleteEntity(id);
			return new Status(1, "Claim deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
}
