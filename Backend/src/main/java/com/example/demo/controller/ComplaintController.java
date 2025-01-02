package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Complaint;
import com.example.demo.service.ComplaintService;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {

    @Autowired
    private ComplaintService cs;

    @PostMapping("comp")
    public ResponseEntity<Complaint> createcomplaint(@RequestBody Complaint com)
    {
        return cs.createcomplaint(com); 
    }

    @GetMapping("")
    public ResponseEntity<List<Complaint>> getall()
    {
        return cs.getall();
    }



    
}
