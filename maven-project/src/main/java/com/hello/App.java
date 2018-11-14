package com.hello;
//import com.entity.Contact;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.format.SignStyle;
import java.util.Map;
import com.entity.Contact;

import org.yaml.snakeyaml.Yaml;
//import org.yaml.snakeyaml.nodes.Tag;
//import java.util.LinkedHashMap;
/**
 * Hello world!
 *
 */
public class App {
    public String hello(String name){

        return "hello, "+name +"!";

    }
    public static void main(String [] args){
        System.out.println(args[0]);
        try {
            Yaml yaml = new Yaml();
            //Read the file
            InputStream input= new FileInputStream(new File(args[0]));
            Map<String,Object> data= (Map<String,Object>) yaml.load(input);
            //Contact contact= new Contact(name, age, phoneNumbers);
            String name=data.get("name").toString();
            Integer age=Integer.parseInt(data.get("age").toString());
            //List<String> phoneNumbers= new List<String>[]{""};
            Contact contact=new Contact(name, age, null);
            System.out.println(contact.getName());

            /*for (Object data : yaml.loadAll(input)) {
                System.out.println(data);
            }*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
      
      
        System.out.println(new App().hello("maven"));
        
       
    }
  
}

