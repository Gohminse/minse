package com.to.cdp.plan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.to.cdp.plan.dao.PlanJobDao;
import com.to.cdp.plan.model.PlanJob;

@Service
@Transactional
public class PlanJobService {
	
	@Autowired
	private PlanJobDao planJobDao;
	
	// planJobInsert
	public int planJobInsert(PlanJob planJob){
		return planJobDao.planJobInsert(planJob);
	}
	
	// planJobUpdate
	public int planJobUpdate(PlanJob planJob){
		return planJobDao.planJobUpdate(planJob);
	}
	
	// planJobDelete
	public int planJobDelete(PlanJob planJob){
		return planJobDao.planJobDelete(planJob);
	}
	
	// planJobList
	public List<PlanJob> planJobList(PlanJob planJob){
		return planJobDao.planJobList(planJob);
	}
	
	// planJobDetail
	public PlanJob planJobDetail(PlanJob planJob){
		return planJobDao.planJobDetail(planJob);
	}
}
