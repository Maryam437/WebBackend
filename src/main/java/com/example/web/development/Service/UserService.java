package com.example.web.development.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.development.Model.User;
import com.example.web.development.Repository.UserRepository;

@Service

public class UserService {
   @Autowired
     private UserRepository userRepo;

    public User findUserByUsername(String username){
        return userRepo.findByUsername(username);
    }

    public User createUser(User user){
        return userRepo.save(user);
    }

    public void deleteuser(Long user){
        userRepo.deleteById(user);
    } 

}
