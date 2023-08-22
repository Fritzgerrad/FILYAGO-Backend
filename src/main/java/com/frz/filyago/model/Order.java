package com.frz.filyago.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.frz.filyago.utils.Location;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String sourceAddress;
    private String destinationAddress;
    private String content;
    @Transient
    private Location location;
    @ManyToOne
    @JoinColumn(name = "courier_id",referencedColumnName = "id")
    @JsonManagedReference
    private Courier courier;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @JsonManagedReference
    private Customer customer;

    private Date createdAt;
    private Date completedAt;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
