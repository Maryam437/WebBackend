package com.example.web.development.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.development.Model.Instructure;


@Repository
public interface InstructureRepository extends  JpaRepository<Instructure, Long> {
    
}
