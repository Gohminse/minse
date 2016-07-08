package com.to.cdp.act.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.to.cdp.act.dao.ActJobDao;
import com.to.cdp.act.model.ActJob;

@Service
@Transactional
public class ActJobService {
	
	@Autowired
	private ActJobDao actJobDao;
	
	// actJobInsert
	public int actJobInsert(ActJob actJob){
		return actJobDao.actJobInsert(actJob);
	}
	
	// actJobUpdate
	public int actJobUpdate(ActJob actJob){
		return actJobDao.actJobUpdate(actJob);
	}
	
	// actJobDelete
	public int actJobDelete(ActJob actJob){
		return actJobDao.actJobDelete(actJob);
	}
	
	// actJobList
	public List<ActJob> actJobList(ActJob actJob){
		return actJobDao.actJobList(actJob);
	}
	
	// actJobDetail
	public ActJob actJobDetail(ActJob actJob){
		return actJobDao.actJobDetail(actJob);
	}
}