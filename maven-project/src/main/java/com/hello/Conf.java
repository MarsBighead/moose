package  com.hello;

import com.entity.Contact;
import com.entity.Config;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;


public  class Conf {
    private Config config;
    public void parse (String filename) {
        Constructor constructor = new Constructor(Config.class);
        try {
            InputStream input= new FileInputStream(new File(filename));
            Config conf = new Yaml(constructor).loadAs( input, Config.class );
            this.config=conf;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void output(String fileName)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("name: "+config.getName()+"\n");
            writer.write("age: "+config.getAge()+"\n");
            writer.write("contact:\n");
            for (Contact contact : config.getContacts()) {
                writer.write("  - type: "+contact.getType()+"\n");
                writer.write("    number: "+contact.getNumber()+"\n");
                writer.write("    email: "+contact.getEmail()+"\n");
            }
            writer.close();
        }  catch (IOException e){
            e.printStackTrace();

        }
    }
    public Config getConf (){
        return config;
    }
}