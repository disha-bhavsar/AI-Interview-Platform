package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resumes")

public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String filename;

    @Column(length = 10000)
    private String content;

    private String feedback;

    public Resume() {
    }

    public Resume(String filename,
                  String content,
                  String feedback) {

        this.filename = filename;
        this.content = content;
        this.feedback = feedback;
    }

    public Long getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}