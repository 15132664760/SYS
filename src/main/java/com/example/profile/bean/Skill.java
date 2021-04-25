package com.example.profile.bean;

import org.springframework.stereotype.Repository;

import java.util.Objects;
@Repository
public class Skill {
    private int id;
    private int userid;
    private String keywords;//技能关键字

    public Skill() {
    }

    public Skill(int userId, String keyWords) {
        this.userid = userId;
        this.keywords = keyWords;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Skill skill = (Skill)o;
            return this.id == skill.id && this.userid == skill.userid && Objects.equals(this.keywords, skill.keywords);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.userid, this.keywords});
    }

    public String toString() {
        return "Skill{id=" + this.id + ", userId=" + this.userid + ", keyWords='" + this.keywords + '\'' + '}';
    }

    public Skill(int id, int userId, String keyWords) {
        this.id = id;
        this.userid = userId;
        this.keywords = keyWords;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
