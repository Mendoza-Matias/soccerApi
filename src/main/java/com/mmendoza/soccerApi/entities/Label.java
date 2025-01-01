package com.mmendoza.soccerApi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "labels")

public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer labelId;

    @Column(name = "description", nullable = false, length = 25)
    private String description;

    @ManyToMany(mappedBy = "labels")
    @JsonIgnore
    private List<News> aNews;
}
