package com.to.cdp.act.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.to.cdp.act.model.ActJob;

@Repository
public class ActJobDao {
	private final String NS="com.to.cdp.repository.CdpMapper";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// actJobInsert
	public int actJobInsert(ActJob actJob){
		return sqlSession.insert(NS + ".actJobInsert", actJob);
	}
	
	// actJobUpdate
	public int actJobUpdate(ActJob actJob){
		return sqlSession.update(NS + ".actJobUpdate", actJob);
	}
	
	// actJobDelete
	public int actJobDelete(ActJob actJob){
		return sqlSession.delete(NS + ".actJobDelete", actJob);
	}
	
	// actJobList
	public List<ActJob> actJobList(ActJob actJob){
		return sqlSession.selectList(NS + ".actJobList", actJob);
	}
	
	// actJobDetail
	public ActJob actJobDetail(ActJob actJob){
		return sqlSession.selectOne(NS + ".actJobDetail", actJob);
	}
}