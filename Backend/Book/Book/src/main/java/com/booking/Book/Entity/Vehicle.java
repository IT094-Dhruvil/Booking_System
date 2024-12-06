package com.booking.Book.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int v_id;
    String v_company;
    String v_model;
    String v_name;
    @ManyToOne
    @JoinColumn(name = "u_id")
    User user;
}
