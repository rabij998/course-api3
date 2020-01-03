package com.rabin.springboot.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String explanation;

    public Course() {
    }

    public Course(String id, String name, String explanation) {
        this.id = id;
        this.name = name;
        this.explanation = explanation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
