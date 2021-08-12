package com.wsspring.WorkshopSpringBootMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wsspring.WorkshopSpringBootMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
