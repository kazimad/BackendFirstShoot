package com.example.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Visit {

    @Id
    @GeneratedValue
    public Long id;

    public String description;
}
