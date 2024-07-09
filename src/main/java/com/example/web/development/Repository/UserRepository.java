package com.example.web.development.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.web.development.Model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
    User findByUsername(String username);
    
}
