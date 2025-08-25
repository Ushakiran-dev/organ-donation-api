package com.example.demo.service;

import com.example.demo.model.Receptor;
import com.example.demo.repository.ReceptorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReceptorService {
    @Autowired
    ReceptorRepo receptors;

    public List<Receptor> getReceptors()
    {
        return receptors.findAll();

    }

    public void addDetails(Receptor newdetails)
    {
        receptors.save(newdetails);

    }

   public List<Receptor> getSortDetail()
    {
        return receptors.findAllByOrderByOrganRequiredAscPatientLifeSpanAscAgeDesc();
    }
}
