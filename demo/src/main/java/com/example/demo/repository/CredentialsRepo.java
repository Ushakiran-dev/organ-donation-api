package com.example.demo.repository;

import com.example.demo.model.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialsRepo extends JpaRepository<Credentials,Integer> {
    boolean existsByUsernameAndPassword(String username, String password);
}
