package com.vtown.appfreelanceserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vtown.appfreelanceserver.entity.State;
import com.vtown.appfreelanceserver.service.StateService;

@RestController
@RequestMapping("/api/states")
public class StateController {

	
	@Autowired
	StateService stateService;	
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<State> findAll() {
		return stateService.findAll();
	}
	
}
