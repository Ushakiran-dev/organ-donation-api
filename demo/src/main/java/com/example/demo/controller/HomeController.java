package com.example.demo.controller;

import com.example.demo.model.Credentials;
import com.example.demo.model.Receptor;
import com.example.demo.service.CredentialsService;
import com.example.demo.service.ReceptorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController

public class HomeController {
    @Autowired
    CredentialsService user;
    @Autowired
    ReceptorService service;

    @GetMapping("/hospital")
    public List<Receptor> getDetails()
    {
        return service.getSortDetail();
    }


    @PostMapping("/credit")
    public ResponseEntity<String> userCheck(@RequestBody Credentials cred) {
        boolean isValid = user.userCheck(cred);
        if (isValid) {
            return ResponseEntity.ok("Login Successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");

        }
    }

}
