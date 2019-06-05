package  com.hello;

import com.entity.Contact;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

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
    public Contact getContact(){
        return contact;
    }
}