package com.example.demo.model;

import java.util.List;

public class InterviewRequest {

    private String userEmail;

    private List<String> answers;

    public InterviewRequest() {
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}