package com.example.web.development.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.web.development.Model.Instructure;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.web.development.Service.InstuctureService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/instructure")
public class InstructureController {
   
    @Autowired
    private InstuctureService instructureService;
    @GetMapping("/all")
    public ResponseEntity<List<Instructure>> getAllInstructure(){
        List<Instructure> instructures = instructureService.getAllInstructures();
        return new ResponseEntity<>(instructures,HttpStatus.OK);
    }
    
    @PostMapping("/create")
        public Instructure createinstructure(@RequestBody Instructure instructure){
           return instructureService.createInstructure(instructure);
        }
    @PutMapping("/update")
    public ResponseEntity<Instructure> updateInstructure(@PathVariable("id") Long instructureId, @RequestBody Instructure instructure) {
    instructure.setInstructure_id(instructureId);
    Instructure instructureUpdate = instructureService.updateInstructure(instructure);
    return new ResponseEntity<>(instructureUpdate,HttpStatus.CREATED);

        }

     @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteInstructure(@PathVariable("id") Long instructureId){
          instructureService.deleteInstructure(instructureId);
          return new ResponseEntity<String>("Instructure deleted sucessfully", HttpStatus.OK);
        }   
}