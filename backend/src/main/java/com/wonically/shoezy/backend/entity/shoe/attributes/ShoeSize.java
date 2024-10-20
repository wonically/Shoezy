package com.wonically.shoezy.backend.entity.shoe.attributes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wonically.shoezy.backend.utils.SizingSystem;
import com.wonically.shoezy.backend.utils.ValidStatus;
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
@Table(name = "size")
@Entity
public class ShoeSize {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int sizeId;
    
    @Column(name = "size_number")
    float sizeNumber;
    
    @Column(name = "sizing_system")
    @ValidStatus(status = SizingSystem.class, message = "INVALID_SIZING_SYSTEM")
    String sizingSystem;
    
    @Column(name = "foot_length")
    float footLength;
    
    @Column(name = "foot_width")
    float footWidth;
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "details_quantity")
    @OneToMany(mappedBy = "shoeSize", fetch = FetchType.LAZY)
    Set<ShoeDetails> shoeDetails;
    
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
