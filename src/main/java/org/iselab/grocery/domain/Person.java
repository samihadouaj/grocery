package org.iselab.grocery.domain;

public abstract class Person {
    private String name;


    public  Person(String name){
        this.name=name;
    }
    public String sayNyName(){
        return this.name;
    }

}
