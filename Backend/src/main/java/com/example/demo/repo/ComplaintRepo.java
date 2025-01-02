package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Complaint;

public interface ComplaintRepo extends JpaRepository<Complaint,Long>{
    
}
