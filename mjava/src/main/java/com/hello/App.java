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

