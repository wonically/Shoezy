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
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "permission")
@Entity
public class Permission {
    
    @Id
    @Column(name = "name")
    String permissionName;
    
    @Column(name = "description")
    String permissionDescription;
    
    @Column(name = "status")
    String permissionStatus;
    
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
