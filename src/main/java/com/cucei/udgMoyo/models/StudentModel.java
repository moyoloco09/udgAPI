package com.cucei.udgMoyo.models;

import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
// constructor sin argumentos
// constructor con todos los argumentos

@Entity
@Table(name="students")
//@Getter
//@Setter
// constructor sin argumentos
// constructor con todos los argumentos
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    @Column(unique = true)
    private String code;
    private String name;
    private String email;
    private String degree;
    private Double score;

    public StudentModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
