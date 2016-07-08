package com.to.cdp.act.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.to.cdp.act.model.ActJob;
import com.to.cdp.act.service.ActJobService;

@Controller
public class ActJobController {
	@Autowired
	private ActJobService actJobService;
	
	// 1. actJobInsert
	@RequestMapping(value="/actJobInsert", method=RequestMethod.GET)
	public String actJobInsert(){
		return "actJobInsert";
	}
	
	@RequestMapping(value="/actJobInsert", method=RequestMethod.POST)
	public String actJobInsert(ActJob actJob){
		return "actJobDetail";
	}
	
	// 2. actJobUpdate
	@RequestMapping(value="/actJobUpdate", method=RequestMethod.GET)
	public String actJobUpdate(){
		return "actJobUpdate";
	}
	
	@RequestMapping(value="/actJobUpdate", method=RequestMethod.POST)
	public String actJobUpdate(ActJob actJob){
		return "actJobDetail";
	}
	
	// 3. actJobDelete
	@RequestMapping(value="/actJobDelete", method=RequestMethod.GET)
	public String actJobDelete(){
		return "actJobDelete";
	}
	
	@RequestMapping(value="/actJobDelete", method=RequestMethod.POST)
	public String actJobDelete(ActJob actJob){
		return "redirect:/actJobList";
	}
	
	// 4. actJobList
	@RequestMapping(value="/actJobList", method=RequestMethod.GET)
	public String actJobList(){
		return "actJobList";
	}
	
	@RequestMapping(value="/actJobList", method=RequestMethod.POST)
	public String actJobList(ActJob actJob){
		return "actJobList";
	}
	
	// 5. actJobDetail
	@RequestMapping(value="/actJobDetail", method=RequestMethod.GET)
	public String actJobDetail(){
		return "actJobDetail";
	}
	
	@RequestMapping(value="/actJobDetail", method=RequestMethod.POST)
	public String actJobDetail(ActJob actJob){
		return "actJobDetail";
	}
}