# Build with ant

```shell
duanp-m02:ant-project duanp$ ant compile
Buildfile: /Users/duanp/project/moose/build.xml

clean:
   [delete] Deleting directory /Users/duanp/project/moose/build

compile:
    [mkdir] Created dir: /Users/duanp/project/moose/build/classes
    [javac] Compiling 1 source file to /Users/duanp/project/moose/build/classes

BUILD SUCCESSFUL
Total time: 0 seconds
```

* Build and run with ant

```shell
duanp-m02:ant-project duanp$ ant run
Buildfile: /Users/duanp/project/moose/build.xml

clean:
   [delete] Deleting directory /Users/duanp/project/moose/build

compile:
    [mkdir] Created dir: /Users/duanp/project/moose/build/classes
    [javac] Compiling 1 source file to /Users/duanp/project/moose/build/classes

run:
     [java] Hello, moose!

BUILD SUCCESSFUL
Total time: 0 seconds
```

* Build jar pacakage, and run it

```shell
duanp-m02:ant-project duanp$ ant jar
Buildfile: /Users/duanp/project/moose/build.xml

clean:
   [delete] Deleting directory /Users/duanp/project/moose/build

compile:
    [mkdir] Created dir: /Users/duanp/project/moose/build/classes
    [javac] Compiling 1 source file to /Users/duanp/project/moose/build/classes

run:
     [java] Hello, moose!

jar:
      [jar] Building jar: /Users/duanp/project/moose/HelloWorld.jar

BUILD SUCCESSFUL
Total time: 0 seconds
duanp-m02:moose duanp$ java -jar HelloWorld.jar
Hello, moose!
```

## Reference

* [Apply Ant in Java project][ref]

[ref]:https://www.cnblogs.com/Donnnnnn/p/7498224.html