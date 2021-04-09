package com.example.demo.Dao.repo;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserReposotory extends JpaRepository<User, Long> {
    
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

     Optional<User> findByUsername(String username);
}
