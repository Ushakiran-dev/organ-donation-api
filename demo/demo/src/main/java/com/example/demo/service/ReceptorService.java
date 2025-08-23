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

    /*List<Receptor> receptors= new ArrayList<>(Arrays.asList(new Receptor(1,123456789,"Surya Vardhan","Heart",29),
    new Receptor(2, 923847561, "Meera Iyer", "Liver", 42),
    new Receptor(3, 738291045, "Anjali Mehta", "Kidney", 29),
    new Receptor(4, 654320198, "Arjun Patel", "Lung", 47),
    new Receptor(5, 789654321, "Sunita Sharma", "Pancreas", 33),
    new Receptor(6, 812345907, "Ravi Kumar", "Heart", 36),
    new Receptor(7, 901283746, "Anjali Mehta", "Liver", 40),
    new Receptor(8, 776543219, "Sunita Sharma", "Kidney", 27),
    new Receptor(9, 888765432, "Meera Iyer", "Lung", 45),
    new Receptor(10, 998877665, "Arjun Patel", "Pancreas", 31)));*/



    public List<Receptor> getReceptors()
    {
        return receptors.findAll();

    }
    public Receptor getDetailsbyId(int id)
    {
       return receptors.findById(id).orElse(new Receptor());
        /*return receptors.stream()
                .filter(p-> p.getId()==id)
                        .findFirst().get() ;

         */
    }
    public void addDetails(Receptor newdetails)
    {
        receptors.save(newdetails);

        /*receptors.add(newdetails);

         */


    }
    public void updateDetails(Receptor updatedetails)
    {
        receptors.save(updatedetails);
        /*int index =0;
        for(int i=0;i< receptors.size();i++)
        {
            if(receptors.get(i).getId()==updatedetails.getId())
            {
                index=i;
            }
        }
        receptors.set(index,updatedetails);

         */
    }
    public void deleteDetails(int id)
    {
        receptors.deleteById(id);
        /*int index =0;
        for(int i=0;i< receptors.size();i++)
        {
            if(receptors.get(i).getId()==id)
            {
                index=i;
            }
        }
        receptors.remove(index);

         */
    }
   public List<Receptor> getSortDetail()
    {
        return receptors.findAllByOrderByOrganRequiredAscPatientLifeSpanAscAgeDesc();
    }
}
