package com.carloszaragoza.expensetracker.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String description;
    private double amount;
    private Date date;

    @ManyToOne
    private User user;

}
