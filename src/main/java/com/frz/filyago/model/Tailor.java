package com.frz.filyago.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.frz.filyago.dto.TailorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tailors")
public class Tailor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private long id;
    private String firstname;
    private String lastname;
    @Column(unique = true, updatable = false, nullable = false)
    private String username;
    @Transient
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;
    @Column(nullable = false)
    private char gender;
    private String nationality;
    private int noOfClothsSewn;
    private String address;

    private String style;
    private double rating;
    private String activation_code;
    @Column(length = 11)
    private String phone;
    @Column(length = 10)
    private String account_number;
    private String Bank;
    private String account_name;
    private Date created_at;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonManagedReference
    private User user;

    @OneToMany
    @JsonBackReference
    private Set<Clothing> clothes;


    public static Tailor CREATE(TailorDTO tailorDTO){
        Tailor tailor = new Tailor();
        tailor.setCreated_at(tailorDTO.getCreated_at());
        tailor.setFirstname(tailorDTO.getFirstname());
        tailor.setLastname(tailorDTO.getLastname());
        tailor.setPassword(tailorDTO.getPassword());
        tailor.setUsername(tailorDTO.getUsername());
        tailor.setPhone(tailorDTO.getPhone());
        tailor.setActivation_code(tailorDTO.getActivationCode());
        tailor.setGender(tailorDTO.getGender());
        tailor.setAge(tailorDTO.getAge());
        tailor.setNationality(tailorDTO.getNationality());

        return tailor;
    }


}
