package com.frz.filyago.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String gender;
    private String style;
    private double initialPrice;
    private double updatedPrice;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    @JsonManagedReference
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "tailor_id",referencedColumnName = "id")
    @JsonManagedReference
    private Tailor tailor;
    private Date orderDate;
    private Date expectedDeliveryDate;
    private Date actualDeliveryDate;
    @Enumerated(EnumType.STRING)
    private ClothingStatus clothingStatus;
    private int elapsedBy;
}
