package com.example.USERSERVICE.services;

import com.example.USERSERVICE.entity.User;
import com.example.USERSERVICE.exception.Usernotfoundexception;
import com.example.USERSERVICE.dao.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class Userserviceimpl implements Userservice{

    @Autowired
    private Userrepository userrepository;

    @Override
    public User saveuser(User u) {
        u.setUserid(UUID.randomUUID().toString());
        return userrepository.save(u);
    }

    @Override
    public List<User> getalluser() {
        return userrepository.findAll();
    }

    @Override
    public User getid(String id) {
        return userrepository.findById(id).orElseThrow(() -> new Usernotfoundexception("User not present with userid :"+id));
    }

    @Override
    public User updateuser(String id, User u) {
        User user = userrepository.findById(id).orElseThrow(() -> new Usernotfoundexception("User not present with userid " + id));
      user.setName(u.getName());
      user.setAbout(u.getAbout());
      user.setEmail(u.getEmail());
        return user;
    }

    @Override
    public String deleteuser(String id) {
        String result = null;
        if (userrepository.existsById(id)) {
            userrepository.deleteById(id);
            result = "User deleted with userid" + id;
        } else {
            result = "User does not exist  with userid " + id;
        }

        return result;
    }
}
