package com.booking.Book.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int u_id;
    String u_name;
    @Column(nullable = false,unique = true)
    String u_email;
    String u_pass;
    String hash_pass;
    Boolean isAdmin;
    String phone_number;
    @OneToMany(mappedBy = "user")
    List<Vehicle> vehicles;
}
