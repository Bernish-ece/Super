package com.ecebatch2.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecebatch2.demo2.domain.User;

@Repository
public interface LoginRepo extends JpaRepository<User, String> {
User findByUsernameAndPassword(String username, String password);
}
