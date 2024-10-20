package com.wonically.shoezy.backend.entity.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.Shoe;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.net.URL;
import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "image")
@Entity
public class ShoeImage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID imageId;
    
    @Column(name = "url", unique = true)
    URL imageUrl;
    
    @Column(name = "name")
    String imageName;
    
    @Column(name = "description")
    String imageDescription;
    
    @ManyToOne
    @JoinColumn(name = "shoe")
    Shoe shoe;
    
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
