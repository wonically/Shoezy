package com.wonically.shoezy.backend.entity.shoe.attributes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wonically.shoezy.backend.entity.shoe.Shoe;
import com.wonically.shoezy.backend.utils.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "factory")
@Entity
public class Factory {
    @Id
    @Column(name = "name")
    String factoryName;

    @Column(name = "address", unique = true)
    String factoryAddress;

    @Column(name = "status")
    String factoryStatus;

    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "shoe")
    @OneToMany(mappedBy = "factory", fetch = FetchType.LAZY)
    Set<Shoe> shoe;
    
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
