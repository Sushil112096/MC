package com.example.USERSERVICE.controller;

import com.example.USERSERVICE.entity.User;
import com.example.USERSERVICE.services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Usercontroller {

    @Autowired
    private Userservice userservice;

//single user
    @GetMapping("/{id}")
public ResponseEntity<User> finduser(@PathVariable  String id){
    return  new ResponseEntity<User>(userservice.getid(id),HttpStatus.FOUND);
}

    //getall user
    @GetMapping
public ResponseEntity<List<User>> getalluser()
{
    List<User> getalluser = userservice.getalluser();
    return new ResponseEntity<List<User>>( getalluser,HttpStatus.OK);
}

    //save user
    @PostMapping
public ResponseEntity<User> saveuser(@RequestBody User user)
{
    return  new ResponseEntity<User>(userservice.saveuser(user), HttpStatus.CREATED);
}

@PutMapping("/update/{id}")
    public ResponseEntity<User> updateuser(@PathVariable String id,@RequestBody User user)
{
    return new ResponseEntity<User>(userservice.updateuser(id,user),HttpStatus.OK);
}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteuser(@PathVariable String id)
    {
        return new ResponseEntity<String>(userservice.deleteuser(id),HttpStatus.OK);
    }
}
