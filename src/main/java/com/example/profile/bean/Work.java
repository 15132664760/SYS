package com.example.profile.bean;

import java.util.Objects;

public class Work {
    private int id;
    private int userid;
    private String start;
    private String end;
    private String company;
    private String job;
    private String description;
    private Work next;

    public Work getNext() {
        return this.next;
    }

    public void setNext(Work next) {
        this.next = next;
    }

    public String toString() {
        return "Work{id=" + this.id + ", userId=" + this.userid + ", start='" + this.start + '\'' + ", end='" + this.end + '\'' + ", company='" + this.company + '\'' + ", job='" + this.job + '\'' + ", description='" + this.description + '\'' + ", next=" + this.next + '}';
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

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
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
            Work work = (Work)o;
            return this.id == work.id && this.userid == work.userid && Objects.equals(this.start, work.start) && Objects.equals(this.end, work.end) && Objects.equals(this.company, work.company) && Objects.equals(this.job, work.job) && Objects.equals(this.description, work.description);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.userid, this.start, this.end, this.company, this.job, this.description});
    }

    public Work(int id, int userId, String start, String end, String company, String job, String description) {
        this.id = id;
        this.userid = userId;
        this.start = start;
        this.end = end;
        this.company = company;
        this.job = job;
        this.description = description;
    }

    public Work(int userId, String start, String end, String company, String job, String description) {
        this.userid = userId;
        this.start = start;
        this.end = end;
        this.company = company;
        this.job = job;
        this.description = description;
    }

    public Work() {
    }
}
