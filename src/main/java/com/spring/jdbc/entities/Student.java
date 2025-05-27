package com.spring.jdbc.entities;

public class Student {
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
    private int id;
    private String name;
    private String city;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public Student() {
    }
    public void setCity(String city) {
        this.city = city;
    }
    

}
