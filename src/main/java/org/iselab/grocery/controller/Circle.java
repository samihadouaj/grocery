package org.iselab.grocery.controller;

public class Circle extends Shapes {
    double d;
    String name;

    public Circle(double d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public double calculateArea(double d) {
        return d*3.14;
    }


}
