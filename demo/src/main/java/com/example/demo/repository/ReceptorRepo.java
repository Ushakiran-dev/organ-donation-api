package com.example.demo.repository;

import com.example.demo.model.Receptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceptorRepo extends JpaRepository<Receptor,Integer> {
   List<Receptor> findAllByOrderByOrganRequiredAscPatientLifeSpanAscAgeDesc();



}
