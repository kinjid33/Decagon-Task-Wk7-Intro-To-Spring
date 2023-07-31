package com.ecommerce.akinjides.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

//Lombok and spring annotations for constructors and mapping to database table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users_table")
public class User {
    @Id //sets primary key for table
    @GeneratedValue(strategy = IDENTITY) //sets primary key generation strategy to Identity which means it will be
//    generated by the database id column
    private Long id;
    private String name;
    private String email;
    private String password;
    private String is_admin;
}