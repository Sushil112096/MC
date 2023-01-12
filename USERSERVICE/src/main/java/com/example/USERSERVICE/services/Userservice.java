package com.example.USERSERVICE.services;

import com.example.USERSERVICE.entity.User;
import com.sun.xml.bind.v2.TODO;

import java.util.List;

public interface Userservice {

    User saveuser(User u);

    List<User> getalluser();

    User getid(String id);

    User updateuser(String id,User u);

    String deleteuser(String id);

}
