package com.example.demo.service;


import com.example.demo.model.Credentials;
import com.example.demo.repository.CredentialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialsService {
    @Autowired
    CredentialsRepo user;

    public boolean userCheck(Credentials cred)
    {
        return user.existsByUsernameAndPassword(cred.getUsername(), cred.getPassword());

    }



}
