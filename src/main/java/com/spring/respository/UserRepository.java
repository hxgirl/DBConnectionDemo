package com.spring.respository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByEmail(String email);
}
