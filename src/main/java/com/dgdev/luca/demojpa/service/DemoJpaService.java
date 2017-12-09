package com.dgdev.luca.demojpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dgdev.luca.demojpa.entity.User;
import com.dgdev.luca.demojpa.repository.UserRepository;

@Component
public class DemoJpaService {

	@Autowired
	UserRepository userRepository;
	
	@Transactional
	public long saveUser(User user)
	{
		User u = userRepository.save(user);
		
//		throw new RuntimeException("ROLLBACK");
		return u.getId();
	}
}
