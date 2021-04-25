package com.example.profile.bean;

import org.springframework.stereotype.Repository;

import java.util.Objects;
@Repository
public class Specialty {
    private int id;
    private int userId;
    private String name;
    private String description;
    private Specialty next;

    public Specialty getNext() {
        return this.next;
    }

    public void setNext(Specialty next) {
        this.next = next;
    }

    public Specialty() {
    }

    public Specialty(int userId, String name, String description) {
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

    public Specialty(int id, int userId, String name, String description) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return "Specialty{id=" + this.id + ", userId=" + this.userId + ", name='" + this.name + '\'' + ", description='" + this.description + '\'' + ", next=" + this.next + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Specialty specialty = (Specialty)o;
            return this.id == specialty.id && this.userId == specialty.userId && Objects.equals(this.name, specialty.name) && Objects.equals(this.description, specialty.description);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.userId, this.name, this.description});
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
