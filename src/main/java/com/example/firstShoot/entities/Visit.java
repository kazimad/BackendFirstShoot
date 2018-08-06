package com.example.firstShoot.entities;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Visit {

    @Id
    @GeneratedValue
    public Long id;

    public String description;
}
