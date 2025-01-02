package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService us;
    @PostMapping("/reg")
    public ResponseEntity<User> createuser(@RequestBody User user)
    {
        return us.createuser(user);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User>getUserById(@PathVariable("id") Long id)
    {
        return us.getUserById(id);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateuser(@PathVariable("id") Long id,@RequestBody User user)
    {
        return us.updateuser(id,user);
    }

    @GetMapping("all")
    public ResponseEntity<List<User>> getAllUsers()
    {
        return us.getAllUsers();
    }

     @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id) {
        return us.deleteUser(id);
    }
}
