package com.wonically.shoezy.backend.entity.shoe;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wonically.shoezy.backend.entity.shoe.attributes.*;
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
@Table(name = "shoe")
@Entity
public class Shoe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    UUID shoeId;
    
    @Column(name = "code", unique = true)
    String shoeCode;
    
    @Column(name = "name", unique = true)
    String shoeName;
    
    @Column(name = "description")
    String shoeDescription;
    
    @ManyToOne
    @JoinColumn(name = "country")
    Country country;
    
    @ManyToOne
    @JoinColumn(name = "factory")
    Factory factory;
    
    @ManyToOne
    @JoinColumn(name = "heel")
    ShoeHeel shoeHeel;
    
    @ManyToOne
    @JoinColumn(name = "insole")
    ShoeInsole shoeInsole;
    
    @ManyToOne
    @JoinColumn(name = "material")
    ShoeMaterial shoeMaterial;
    
    @ManyToOne
    @JoinColumn(name = "tip")
    ShoeTip shoeTip;
    
    @ManyToOne
    @JoinColumn(name = "zipper")
    ShoeZipper shoeZipper;
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "shoe_details")
    @OneToMany(mappedBy = "shoe", fetch = FetchType.LAZY)
    Set<ShoeDetails> shoeDetails;
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "image")
    @OneToMany(mappedBy = "shoe", fetch = FetchType.LAZY)
    Set<ShoeImage> shoeImage;
    
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
