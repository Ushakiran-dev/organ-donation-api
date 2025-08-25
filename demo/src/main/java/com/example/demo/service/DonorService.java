package com.example.demo.service;

import com.example.demo.model.Donor;
import com.example.demo.repository.DonorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    @Autowired
    DonorRepo repo;

    public List<Donor> getAllDetails()
    {

        return repo.findAll();
    }

    public void addDetails(Donor donor) {

        repo.save(donor);
    }

}
