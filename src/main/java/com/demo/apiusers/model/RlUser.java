package com.demo.apiusers.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RlUser {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
   private Long id;
   @Column(nullable = false, unique = true)
   private String username;
   @Column(nullable = false)
   private String password;
   @ManyToOne
   @JoinColumn(name = "role_id")
   private RlRole role;
}
