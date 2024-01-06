package com.reso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reso.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User findById(User user);

	User findUserByUsername(String username);

	
}
