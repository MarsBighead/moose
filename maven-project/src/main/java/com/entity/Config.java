package com.entity;

import java.util.List;

/**
 * Created by Paul on 2018-11-14.
 */
public class Config {
    private String name;
    private Integer age;
    private List<Contact> contacts;

    /*public Contact(String name, int age, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneNumbers=" + contacts +
                '}';
    }
}