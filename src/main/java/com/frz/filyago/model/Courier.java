package com.frz.filyago.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "couriers")

public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String nationality;
    private String gender;
    private String phone;
    private String email;

    private String residentialAddress;
    private String accountName;
    private String accountNumber;
    private String bank;
    @OneToMany(mappedBy = "courier")
    @JsonBackReference
    private Set<Order> orders;
    private String State;
    private String range;
    private String guarantorName;
    private String guarantorPhone;
    private String guarantorAddress;
    private String guarantorEmail;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonManagedReference
    private User user;
}
