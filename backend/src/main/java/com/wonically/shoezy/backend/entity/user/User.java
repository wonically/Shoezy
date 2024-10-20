package com.wonically.shoezy.backend.entity.user;

import com.wonically.shoezy.backend.utils.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    UUID id;
    
    @Column(name = "code", unique = true)
    String code;
    
    @Column(name = "password")
    String password;
    
    @Column(name = "name")
    String name;
    
    @Column(name = "date_of_birth")
    LocalDate dateOfBirth;
    
    @Column(name = "gender")
    String gender;
    
    @Column(name = "email")
    String email;
    
    @Column(name = "phone_number")
    String phoneNumber;
    
    @Column(name = "status")
    String status;
    
    @Column(name = "date_created")
    @CreationTimestamp
    Instant dateCreated;
    
    @Column(name = "date_updated")
    @UpdateTimestamp
    Instant dateUpdated;
    
}
