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
    public Donor getDetailsById(int id)
    {
        return repo.findById(id).orElse(new Donor());
      
    }

    public void addDetails(Donor donor) {
        repo.save(donor);
    }

    public void updateDetails(Donor donor)
    {
        repo.save(donor);
    }

    public void deleteDetails(Donor donor)
    {
        repo.delete(donor);
    }


    public void deleteDetailsbyId(int id) {
        repo.deleteById(id);
    }
}
