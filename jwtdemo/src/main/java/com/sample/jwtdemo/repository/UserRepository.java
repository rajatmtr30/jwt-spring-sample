package com.sample.jwtdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.jwtdemo.view.bean.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
