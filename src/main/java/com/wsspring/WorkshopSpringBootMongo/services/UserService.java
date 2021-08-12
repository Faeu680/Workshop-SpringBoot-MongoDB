package com.wsspring.WorkshopSpringBootMongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsspring.WorkshopSpringBootMongo.domain.User;
import com.wsspring.WorkshopSpringBootMongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
