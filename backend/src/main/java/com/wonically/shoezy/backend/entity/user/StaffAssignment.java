package com.wonically.shoezy.backend.entity.user;

import com.wonically.shoezy.backend.utils.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "staff_assignment")
@Entity
public class StaffAssignment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    UUID assignmentId;
    
    @ManyToOne
    @JoinColumn(name = "staff")
    Staff staff;
    
    @ManyToOne
    @JoinColumn(name = "position")
    Position position;
    
    @Column(name = "start_date")
    LocalDate startDate;
    
    @Column(name = "end_date")
    LocalDate endDate;
    
    @Column(name = "status")
    String status;
    
    //Default logging
    @Column(name = "date_created")
    @CreationTimestamp
    Instant dateCreated;
    
    @Column(name = "created_by")
    @CreatedBy
    UUID createdBy;
    
    @Column(name = "date_updated")
    @UpdateTimestamp
    Instant dateUpdated;
    
    @Column(name = "updated_by")
    @LastModifiedBy
    UUID updatedBy;
    
}
