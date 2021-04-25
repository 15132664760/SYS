package com.example.profile.bean;

import org.springframework.stereotype.Repository;

import java.util.Objects;
@Repository
public class Edu {
    private int id;
    private int userid;
    private String start;
    private String end;
    private String school;
    private String study;
    private String description;
    private Edu next;

    public Edu(int userId, String start, String end, String school, String study, String description, Edu next) {
        this.userid = userId;
        this.start = start;
        this.end = end;
        this.school = school;
        this.study = study;
        this.description = description;
        this.next = next;
    }

    public Edu getNext() {
        return this.next;
    }

    public void setNext(Edu next) {
        this.next = next;
    }

    public String toString() {
        return "Edu{id=" + this.id + ", userId=" + this.userid + ", start='" + this.start + '\'' + ", end='" + this.end + '\'' + ", school='" + this.school + '\'' + ", study='" + this.study + '\'' + ", description='" + this.description + '\'' + ", next=" + this.next + '}';
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return this.userid;
    }

    public void setUserId(int userId) {
        this.userid = userId;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudy() {
        return this.study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Edu edu = (Edu)o;
            return this.id == edu.id && this.userid == edu.userid && Objects.equals(this.start, edu.start) && Objects.equals(this.end, edu.end) && Objects.equals(this.school, edu.school) && Objects.equals(this.study, edu.study) && Objects.equals(this.description, edu.description);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.userid, this.start, this.end, this.school, this.study, this.description});
    }

    public Edu() {
    }

    public Edu(int userId, String start, String end, String school, String study, String description) {
        this.userid = userId;
        this.start = start;
        this.end = end;
        this.school = school;
        this.study = study;
        this.description = description;
    }

    public Edu(int id, int userId, String start, String end, String school, String study, String description) {
        this.id = id;
        this.userid = userId;
        this.start = start;
        this.end = end;
        this.school = school;
        this.study = study;
        this.description = description;
    }
}
