package com.portfolio.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class project {
    @Id@GeneratedValue
    private Long id;

    String name;

    public project(String name) {
        this.name = name;
    }

    public project() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
