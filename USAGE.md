# Usage of Maven

Here are some samples of maven usage in simple java project.

*. Initial command line:

```shell
duanp-m02:moose duanp$  mvn archetype:generate -DgroupId=com.hello -DartifactId=mjava  -DinteractiveMode=false -DarchetypeCatalog=internal
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.0.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.0.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.0.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Batch mode
[INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Old (1.x) Archetype: maven-archetype-quickstart:1.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: basedir, Value: /Users/duanp/project/moose
[INFO] Parameter: package, Value: com.hello
[INFO] Parameter: groupId, Value: com.hello
[INFO] Parameter: artifactId, Value: mjava
[INFO] Parameter: packageName, Value: com.hello
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] project created from Old (1.x) Archetype in dir: /Users/duanp/project/moose/mjava
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.756 s
[INFO] Finished at: 2018-03-09T23:20:57+08:00
[INFO] Final Memory: 15M/309M
[INFO] ------------------------------------------------------------------------
duanp-m02:moose duanp$ cd  mjava/e
```

* Build .jar pakackage

```shell
duanp-m02:mjava duanp$ find . -type f -name "*.jar"
duanp-m02:mjava duanp$ ls
bin     pom.xml src
duanp-m02:mjava duanp$ mvn clean package
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building mjava 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ mjava ---
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ mjava ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/duanp/project/moose/mjava/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ mjava ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/duanp/project/moose/mjava/target/classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ mjava ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/duanp/project/moose/mjava/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ mjava ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/duanp/project/moose/mjava/target/test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ mjava ---
[INFO] Surefire report directory: /Users/duanp/project/moose/mjava/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.hello.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ mjava ---
[INFO] Building jar: /Users/duanp/project/moose/mjava/target/mjava-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.688 s
[INFO] Finished at: 2018-03-09T23:27:47+08:00
[INFO] Final Memory: 18M/303M
[INFO] ------------------------------------------------------------------------
duanp-m02:mjava duanp$ find . -type f -name "*.jar"
./target/mjava-1.0-SNAPSHOT.jar
```

* Run the App

```shell
duanp-m02:classes duanp$ pwd
/Users/duanp/project/moose/mjava/target/classes
duanp-m02:classes duanp$ java com.hello.App
Hello World!
```

* Modify the package and re-build

    Old vs changed java code
```java
package com.hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
```

```java
package com.hello;

/**
 * Hello world!
 *
 */
public class App {
    public String hello(String name){

        return "hello, "+name +"!";

    }
    public static void main(String [] args){
        System.out.println(new App().hello("maven"));
    }
}
```

Rebuild and running process log.

```shell
duanp-m02:mjava duanp$ mvn clean package
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building mjava 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ mjava ---
[INFO] Deleting /Users/duanp/project/moose/mjava/target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ mjava ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/duanp/project/moose/mjava/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ mjava ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/duanp/project/moose/mjava/target/classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ mjava ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/duanp/project/moose/mjava/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ mjava ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/duanp/project/moose/mjava/target/test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ mjava ---
[INFO] Surefire report directory: /Users/duanp/project/moose/mjava/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.hello.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ mjava ---
[INFO] Building jar: /Users/duanp/project/moose/mjava/target/mjava-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.493 s
[INFO] Finished at: 2018-03-09T23:41:18+08:00
[INFO] Final Memory: 18M/305M
[INFO] ------------------------------------------------------------------------
duanp-m02:mjava duanp$ cd -
/Users/duanp/project/moose/mjava/target/classes
duanp-m02:classes duanp$ java com.hello.App
hello, maven!
```
