package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Complaint;
import com.example.demo.repo.ComplaintRepo;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepo cr;

    public ResponseEntity<Complaint> createcomplaint(Complaint complaint)
    {
        try
        {
            Complaint c1=cr.save(complaint);
            return new ResponseEntity<>(c1,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    public ResponseEntity<List<Complaint>> getall()
    {
        try
        {
            List<Complaint> comp=cr.findAll();
            if(comp.isEmpty())
            {
                return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(comp,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}
