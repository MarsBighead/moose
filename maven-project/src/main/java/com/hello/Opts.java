package  com.hello;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import  org.apache.commons.cli.ParseException;


public class Opts {
    private  String config;
    private  String input;
    private  Boolean version=false;
    private  Boolean help=false;
    public void parse(String[] args) {
        Options options = new Options();
        // add t option
        options.addOption("?", "help", false, "Optional, print this help message.");
        options.addOption("c", "config", true, "Required, configure file, default: config.yaml");
        options.addOption("v", "version", false, "Optional, print the version information and exit");
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            this.config= cmd.getOptionValue("config");
            //System.out.println("configuration filename: "+this.config);
            if  (cmd.hasOption("v")){
                this.version=true;
            }

            if (cmd.hasOption("?") || (this.config==null && !this.version)){
                this.help=true;
                this.printHelp(options);
                System.exit(0);
            }
            //System.out.println("Current in options: "+cmd.getOptionValue("c"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            this.printHelp(options);
            System.exit(1);
        }

    }
    public  void printHelp(Options options){
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp( "couchbase profile", options );
    }

    public Boolean getVersion() {
        return version;
    }

    public String getConfig() {
        if (config==null){
            return  "config.yaml";
        }
        return config;
    }
}