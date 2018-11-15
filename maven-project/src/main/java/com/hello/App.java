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

import com.entity.Contact;

/**
 * Hello world!
 *
 */
public class App {
    public String hello(String name){
        return "hello, "+name +"!";
    }

    @SuppressWarnings ("unchecked")
    public  Contact getContact(String configPath){
        Contact contact=null;
        try {
            Yaml yaml = new Yaml();
            //Read the config file from the config Path
            InputStream input= new FileInputStream(new File(configPath));
            Map<String,Object> data= (Map<String, Object>) yaml.load(input);
            String name=data.get("name").toString();
            Integer age=Integer.parseInt(data.get("age").toString());
            List<String>   phoneNumbers= (List<String>) data.get("phoneNumbers");
            //List<String> phoneNumbers=Arrays.asList();
            contact=new Contact(name, age, phoneNumbers);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return contact;
    }
    public static void main(String [] args){
        App app=new App();
        System.out.println(app.hello("maven"));
        String configPath="config/contact.yaml";
        if (args.length>0){
            configPath=args[0];
        }
       
        Contact contact=app.getContact(configPath);
        System.out.printf("Name: %s\nAge: %d\n",contact.getName(), contact.getAge());
        System.out.println("Phon Numbers:"+contact.getPhoneNumbers());
      
        
       
    }
  
}

