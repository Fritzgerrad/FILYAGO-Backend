package com.frz.filyago.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "measurements")
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    @JsonManagedReference
    private User user;
    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @JsonManagedReference
    private Customer customer;
    int height;
    int weight;
    private double neckCircumference;
    private double armLength;
    private double upperArmCircumference;
    private double lowerArmCircumference;
    private double wristCircumference;
    private double chestCircumference;
    private double torsoLength;
    private double neckToKneeLength;
    private double bustSize;
    private double legLength;
    private double innerLegLength;
    private double waistCircumference;
    private double thighCircumference;
    private double lowerLegCircumference;
    private double feetSize;

}
