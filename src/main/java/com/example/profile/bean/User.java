package com.example.profile.bean;

import org.springframework.stereotype.Repository;

import java.util.Objects;
@Repository
public class User {
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", weixin='" + weixin + '\'' +
                ", qq='" + qq + '\'' +
                ", weibo='" + weibo + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    private int id;
    private String name;
    private int age;
    private String city;
    private String address;
    private String email;
    private String phone;
    private String weixin;
    private String qq;
    private String weibo;
    private String sex;
    private String description;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            User user = (User)o;
            return this.id == user.id && this.age == user.age && Objects.equals(this.name, user.name) && Objects.equals(this.city, user.city) && Objects.equals(this.address, user.address) && Objects.equals(this.email, user.email) && Objects.equals(this.phone, user.phone) && Objects.equals(this.weixin, user.weixin) && Objects.equals(this.qq, user.qq) && Objects.equals(this.weibo, user.weibo) && Objects.equals(this.sex, user.sex) && Objects.equals(this.description, user.description);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.age, this.city, this.address, this.email, this.phone, this.weixin, this.qq, this.weibo, this.sex, this.description});
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeixin() {
        return this.weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getQq() {
        return this.qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeibo() {
        return this.weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User() {
    }

    public User(String name, int age, String city, String address, String email, String phone, String weixin, String qq, String weibo, String sex, String description) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.weixin = weixin;
        this.qq = qq;
        this.weibo = weibo;
        this.sex = sex;
        this.description = description;
    }

    public User(int id, String name, int age, String city, String address, String email, String phone, String weixin, String qq, String weibo, String sex, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.weixin = weixin;
        this.qq = qq;
        this.weibo = weibo;
        this.sex = sex;
        this.description = description;
    }
}
