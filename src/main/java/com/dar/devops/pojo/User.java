package com.dar.devops.pojo;

public class User {

    private String name;
    private int age;
    private String dob;
    private String place;
    private String occupation;

    public User(String name, int age, String dob, String place, String occupation) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.place = place;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
