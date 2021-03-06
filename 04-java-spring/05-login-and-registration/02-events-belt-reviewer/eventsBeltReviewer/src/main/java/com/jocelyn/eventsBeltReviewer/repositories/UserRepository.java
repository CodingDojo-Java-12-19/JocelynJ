package com.jocelyn.eventsBeltReviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jocelyn.eventsBeltReviewer.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String email);

	boolean existsByEmail(String email);
}
