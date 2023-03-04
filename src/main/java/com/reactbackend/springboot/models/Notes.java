package com.reactbackend.springboot.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="table_notes")
@Data
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;
    private String category;
}
