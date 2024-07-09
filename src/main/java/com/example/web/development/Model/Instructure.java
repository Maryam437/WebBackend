package com.example.web.development.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "instructure")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instructure {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private long instructure_id;
 @Column(nullable = false) 
 private String Name;
 @Column(nullable = false)
 private String Subject;
 @Column(nullable = false)
 private String email;
 @Column(nullable = false)
 private String experience;
 @Column(nullable = false)
 private String qualification;

   
}



