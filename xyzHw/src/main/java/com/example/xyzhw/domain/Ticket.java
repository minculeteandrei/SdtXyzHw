package com.example.xyzhw.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("tickets")
public class Ticket {
    private String id;
    private String name;
    private String address;
    private String CNP;
    private String email;
    private String problem;

    public Ticket(String id, String name, String address, String CNP, String email, String problem) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.CNP = CNP;
        this.email = email;
        this.problem = problem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
