package com.example.web.development.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.development.Model.Instructure;
import com.example.web.development.Repository.InstructureRepository;

@Service
public class InstuctureService {

   @Autowired
   private InstructureRepository instructureRepository;
   public List<Instructure> getAllInstructures(){
    return instructureRepository.findAll();
   }
public Instructure createInstructure(Instructure instructure){
       return instructureRepository.save(instructure);
   

}
 public Instructure updateInstructure(Instructure instructure) {
    Instructure extingInstructure = instructureRepository.findById(instructure.getInstructure_id()).get();
    extingInstructure.setName(instructure.getName());
    extingInstructure.setSubject(instructure.getSubject());
    extingInstructure.setEmail(instructure.getEmail());
    extingInstructure.setExperience(instructure.getExperience());
    extingInstructure.setQualification(instructure.getQualification());
    Instructure updateInstructure = instructureRepository.save(extingInstructure);
    return updateInstructure;
 }
 public void deleteInstructure(Long instructureId){
    instructureRepository.deleteById(instructureId);
 }

}
