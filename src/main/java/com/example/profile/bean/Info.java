package com.example.profile.bean;

import java.util.List;
import java.util.Objects;

public class Info {
    private User user;
    private List<Edu> edu;
    private Skill skill;
    private List<Work > work;
    private List<Specialty> specialty;

    public Info(User user, List<Edu> edu, Skill skill, List<Work> work, List<Specialty> specialty) {
        this.user = user;
        this.edu = edu;
        this.skill = skill;
        this.work = work;
        this.specialty = specialty;
    }

    public Info() {
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Info info = (Info)o;
            return Objects.equals(this.user, info.user) && Objects.equals(this.edu, info.edu) && Objects.equals(this.skill, info.skill) && Objects.equals(this.work, info.work) && Objects.equals(this.specialty, info.specialty);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.user, this.edu, this.skill, this.work, this.specialty});
    }

    public String toString() {
        return "Info{user=" + this.user + ", edu=" + this.edu + ", skill=" + this.skill + ", work=" + this.work + ", specialty=" + this.specialty + '}';
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEdu(List<Edu> edu) {
        this.edu = edu;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setWork(List<Work> work) {
        this.work = work;
    }

    public void setSpecialty(List<Specialty> specialty) {
        this.specialty = specialty;
    }

    public User getUser() {
        return user;
    }

    public List<Edu> getEdu() {
        return edu;
    }

    public Skill getSkill() {
        return skill;
    }

    public List<Work> getWork() {
        return work;
    }

    public List<Specialty> getSpecialty() {
        return specialty;
    }
}
