package com.vtown.appfreelanceserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtown.appfreelanceserver.entity.State;
import com.vtown.appfreelanceserver.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	StateRepository stateRepository;
	
	public List<State> findAll() {
		return stateRepository.findAll();
	}
}

