package com.example.backend.model;
import jakarta.persistence.*;
@Entity
@Table(name ="boards")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    public Board() {
    }
 public Long getId() {
        return id;
    }
 public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}