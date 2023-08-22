package com.frz.filyago.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private char gender;
    private String dateOfBirth;
    private String state;
    private String address;
    private String username;
    private String email;
    private String phoneNumber;
    private String discount;

    @OneToOne
    @JoinColumn(name = "measurement_id",referencedColumnName = "id")
    @JsonBackReference
    private Measurement measurement;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonManagedReference
    private User user;

    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private Set<Clothing> clothes;

    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private Set<Order> orders;
}


