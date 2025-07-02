package com.crimereport.crimealertsystem.repository;

import com.crimereport.crimealertsystem.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByEmail(String email);
    User findByEmail(String email);
}
