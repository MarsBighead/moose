package com.entity;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;
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
    public static Config parse (String filename) throws FileNotFoundException{
        return new Yaml(new Constructor(Config.class)).loadAs( new FileInputStream(new File(filename)), Config.class );
    }

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

    public void output(String fileName)  {
        try {
            System.out.println("#### output to file");
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("name: "+this.getName()+"\n");
            writer.write("age: "+this.getAge()+"\n");
            writer.write("contact:\n");
            for (Contact contact : this.getContacts()) {
                writer.write("  - type: "+contact.getType()+"\n");
                writer.write("    number: "+contact.getNumber()+"\n");
                writer.write("    email: "+contact.getEmail()+"\n");
            }
            writer.close();
        }  catch (IOException e){
            e.printStackTrace();

        }
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