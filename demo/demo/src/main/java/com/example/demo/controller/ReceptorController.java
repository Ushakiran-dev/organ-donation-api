package com.example.demo.controller;


import com.example.demo.model.Receptor;
import com.example.demo.service.ReceptorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController

public class ReceptorController {
    @Autowired
    ReceptorService details;



    @GetMapping("/receptor")
    public List<Receptor> getDetail()
    {

        return details.getReceptors();

    }

    @GetMapping("/receptor/{id}")
    public Receptor getDetailsbyId(@PathVariable int id)
    {
        return details.getDetailsbyId(id);
    }



    @PostMapping("/receptor")
    public void addDetails(@RequestBody Receptor newdetails)
    {
            details.addDetails(newdetails);
    }
    @PutMapping("/receptor")
    public void updateDetails(@RequestBody Receptor updatedetails)
    {
        details.updateDetails(updatedetails);
    }


    @DeleteMapping("/receptor/{id}")
    public void deleteDetails(@PathVariable int id)
    {
     details.deleteDetails(id);
    }

}
