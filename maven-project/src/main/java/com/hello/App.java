package com.hello;



import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileNotFoundException;
import java.util.List;

import com.entity.Config;
import com.entity.Contact;

/**
 * Hello world!
 *
 */
public class App {
    public String hello(String name){
        return "hello, "+name +"!";
    }

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
            try {
                Config config=Config.parse(opts.getConfig());
                System.out.println("#### getConfig");
                List<Contact> contacts=config.getContacts();
                System.out.printf("Name: %s\nAsge: %d\n",config.getName(),config.getAge());
                System.out.printf("Type: %s\nNumber: %d\n",contacts.get(0).getType(),contacts.get(0).getNumber());
                config.output("output.yaml");
            }catch (FileNotFoundException e){
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
