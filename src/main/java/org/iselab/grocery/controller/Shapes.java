package org.iselab.grocery.controller;

public abstract class Shapes {
    String shape;

    public Shapes(String shape) {
        this.shape = shape;
    }

    public void  getShape() {
		System.out.println("this is a "+ this.shape);
	}
	public abstract double calculateArea(double d);
	public abstract double calculateArea(double a,double b);



}
