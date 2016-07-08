package com.to.cdp.plan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.to.cdp.plan.model.PlanJob;
import com.to.cdp.plan.service.PlanJobService;

@Controller
public class PlanJobController {
	@Autowired
	private PlanJobService planJobService;
	
	// 1. planJobInsert
	@RequestMapping(value="/planJobInsert", method=RequestMethod.GET)
	public String planJobInsert(){
		return "planJobInsert";
	}
	
	@RequestMapping(value="/planJobInsert", method=RequestMethod.POST)
	public String planJobInsert(PlanJob planJob){
		return "planJobDetail";
	}
	
	// 2. planJobUpdate
	@RequestMapping(value="/planJobUpdate", method=RequestMethod.GET)
	public String planJobUpdate(){
		return "planJobUpdate";
	}
	
	@RequestMapping(value="/planJobUpdate", method=RequestMethod.POST)
	public String planJobUpdate(PlanJob planJob){
		return "planJobDetail";
	}
	
	// 3. planJobDelete
	@RequestMapping(value="/planJobDelete", method=RequestMethod.GET)
	public String planJobDelete(){
		return "planJobDelete";
	}
	
	@RequestMapping(value="/planJobDelete", method=RequestMethod.POST)
	public String planJobDelete(PlanJob planJob){
		return "redirect:/planJobList";
	}
	
	// 4. planJobList
	@RequestMapping(value="/planJobList", method=RequestMethod.GET)
	public String planJobList(){
		return "planJobList";
	}
	
	@RequestMapping(value="/planJobList", method=RequestMethod.POST)
	public String planJobList(PlanJob planJob){
		return "planJobList";
	}
	
	// 5. planJobDetail
	@RequestMapping(value="/planJobDetail", method=RequestMethod.GET)
	public String planJobDetail(){
		return "planJobDetail";
	}
	
	@RequestMapping(value="/planJobDetail", method=RequestMethod.POST)
	public String planJobDetail(PlanJob planJob){
		return "planJobDetail";
	}
}