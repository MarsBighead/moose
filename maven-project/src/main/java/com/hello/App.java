package com.hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
//import java.util.Arrays;
//import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;
//import org.yaml.snakeyaml.nodes.Tag;
//import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.constructor.Constructor;

import com.entity.Contact;

/**
 * Hello world!
 *
 */
public class App {
    public String hello(String name){
        return "hello, "+name +"!";
    }
/*
    @SuppressWarnings ("unchecked")
    public  Contact getContact(String configPath){
        Contact contact=new Contact();
        try {
            Yaml yaml = new Yaml();
            //Read the config file from the config Path
            InputStream input= new FileInputStream(new File(configPath));
            Map<String,Object> data= (Map<String, Object>) yaml.load(input);
            String name=data.get("name").toString();
            Integer age=Integer.parseInt(data.get("age").toString());
            List<String>   phoneNumbers= (List<String>) data.get("phoneNumbers");
            //List<String> phoneNumbers=Arrays.asList();
            contact.setAge(age);
            contact.setName(name);
            contact.setPhoneNumbers(phoneNumbers);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return contact;
    }
*/

    public static void main(String [] args){
        App app=new App();
        System.out.println(app.hello("maven"));
        Opts opts= new Opts();
        opts.parse(args);
        if (opts.getVersion()){
            System.out.println("hello version 0.0.1");
            System.exit(0);
        }

        if (opts.getConfig()!=null){
            Config config = new Config();
            config.parse(opts.getConfig());
            Contact contact= config.getContact();
            System.out.println("#### getContact");
            System.out.printf("Name: %s\nAge: %d\n",contact.getName(), contact.getAge());
        }

        /*
        System.out.println("Phone Numbers:"+contact.getPhoneNumbers()+"\n\n");
        System.out.println("#### getConfig");
        app.getConfig(configPath);
        Integer xs=contact. getAge();
        System.out.println("#### xs with blank:"+xs+"|\n");

        */
       
    }
}
