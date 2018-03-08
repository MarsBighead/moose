# moose

The project moose is used for study Java/Ant

-1. Build with ant

```shell
duanp-m02:moose duanp$ ant compile
Buildfile: /Users/duanp/project/moose/build.xml

clean:
   [delete] Deleting directory /Users/duanp/project/moose/build

compile:
    [mkdir] Created dir: /Users/duanp/project/moose/build/classes
    [javac] Compiling 1 source file to /Users/duanp/project/moose/build/classes

BUILD SUCCESSFUL
Total time: 0 seconds
```

-2. Build and run with ant

```shell
duanp-m02:moose duanp$ ant run
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
