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

  @GetMapping("/donor/{id}")
    public Donor getDetailsById(@PathVariable int id){
        return service.getDetailsById(id);

    }



    @PostMapping("/donor")
    public void addDonorDetails(@RequestBody Donor donor)
    {
        service.addDetails(donor);

    }
    @PutMapping("/donor")
    public void updateDetails(@RequestBody Donor donor)
    {
        service.updateDetails(donor);
    }



    @DeleteMapping("/donor")
    public void deleteDetails(@PathVariable Donor donor){
        service.deleteDetails(donor);
    }

    @DeleteMapping("/donor/{id}")
    public void deleteDetailsbyId(@PathVariable int id){
        service.deleteDetailsbyId(id);
    }



}
