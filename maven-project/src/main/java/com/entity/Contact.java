package com.entity;

import java.util.List;

/**
 * Created by Paul on 2018-11-14.
 */
public class Contact {
    private String type;
    private String email;
    private int number;

    /*public Contact(String name, int age, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                ", type='" + type + '\'' +
                ", numbers=" + number +
                ", email=" + email +
                '}';
    }
}