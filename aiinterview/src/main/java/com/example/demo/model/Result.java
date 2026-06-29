package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "results")

public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String userEmail;

    private int score;

    private int totalQuestions;

    public Result() {
    }

    public Result(String userEmail,
                  int score,
                  int totalQuestions) {

        this.userEmail = userEmail;
        this.score = score;
        this.totalQuestions = totalQuestions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
}