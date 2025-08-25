package com.example.demo.controller;

import com.example.demo.model.Donor;
import com.example.demo.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class DonorController {
    @Autowired
    DonorService service;


    @GetMapping("/donor")
    public List<Donor> getAllDetails()
    {
        return service.getAllDetails();
    }

    @PostMapping("/donor")
    public void addDonorDetails(@RequestBody Donor donor)
    {
        service.addDetails(donor);

    }


}
