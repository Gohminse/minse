package com.to.cdp.plan.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.to.cdp.plan.model.PlanJob;

@Repository
public class PlanJobDao {
	private final String NS="com.to.cdp.repository.CdpMapper";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// planJobInsert
	public int planJobInsert(PlanJob planJob){
		return sqlSession.insert(NS + ".planJobInsert", planJob);
	}
	
	// planJobUpdate
	public int planJobUpdate(PlanJob planJob){
		return sqlSession.update(NS + ".planJobUpdate", planJob);
	}
	
	// planJobDelete
	public int planJobDelete(PlanJob planJob){
		return sqlSession.delete(NS + ".planJobDelete", planJob);
	}
	
	// planJobList
	public List<PlanJob> planJobList(PlanJob planJob){
		return sqlSession.selectList(NS + ".planJobList", planJob);
	}
	
	// planJobDetail
	public PlanJob planJobDetail(PlanJob planJob){
		return sqlSession.selectOne(NS + ".planJobDetail", planJob);
	}
}