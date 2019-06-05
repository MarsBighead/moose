package  com.hello;

import com.entity.Contact;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;


public  class Config {
    private Contact contact;
    public void parse (String filename) {
        Constructor constructor = new Constructor(Contact.class);
        try {
            InputStream input= new FileInputStream(new File(filename));
            this.contact = new Yaml(constructor).loadAs( input, Contact.class );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void output(String fileName)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("name: "+contact.getName()+"\n");
            writer.write("age: "+contact.getAge()+"\n");
            writer.write("phoneNumbers: "+contact.getPhoneNumbers()+"\n");
            writer.close();
        }  catch (IOException e){
            e.printStackTrace();

        }
    }


    public Contact getContact(){
        return contact;
    }
}