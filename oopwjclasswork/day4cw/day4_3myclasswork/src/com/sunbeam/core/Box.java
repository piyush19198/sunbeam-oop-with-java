package com.sunbeam.core;
/*
Objective --
Create a class to represent 3D Box
class Box ---tight encapsulation(achieved by making all non static data members:instance vars private)
state -- width,height , depth --- double : private 
paramterized constr --3 arg constr.
Instance Methods(=non static methods)
1. To return Box details in String form (dimensions of Box)

method declaration --- access specifier(private/default/protected/public) , ret type , name , args
method definition --body

2. To return computed volume of the box.
*/

public class Box {
    // DATA : State --instance variables(attributes/properties)
    // tight encapsulation
    private double width, depth, height;
    private String color;

    // parameterized constr to init complete state of the Box
    public Box(double width, double d, double height) {
        // this => current object ref. used to un hide instance var from method local
        // var.
        this.width = width;// this : mandatory
        depth = d;// this : optional
        this.height = height;// this : mandatory
    }

    // add another overloaded constructor to init side of a cube
    public Box(double side) {
        // width = depth = height = side;
        this(side, side, side);// constructor chaining
    }

    // eg : Box b=new Box(); --no javac err, w=d=h=-1
    // add another overloaded constructor
    public Box() {
        // width=depth=height=-1;
        // this(-1,-1,-1);
        // System.out.println("in arg-less ctor");
        this(-1);// ctor chaining

    }

    // add another overloaded ctor to init color of the box
    public Box(double width, double d, double height, String color) {
        this(width, d, height);
        this.color = color;// this : MANDATORY
    }

    // Business logic : behaviour --methods --non static(instance) methods
    // 1. To return Box details in String form (dimensions of Box
    public String getBoxDimensions() {
        return "Box Dims " + this.width + " " + depth + " " + this.height;
    }

    // Add a method to return computed volume of the box.
    public double getBoxVolume() {
        return width * depth * height;
    }

    // add a method to check equality of the boxes
    // eg : From Tester : b1.isEqual(b2)
    // this =b1 anotherBox=b2 (copy of refs)
    public boolean isEqual(Box anotherBox) {
        return this.width == anotherBox.width && depth == anotherBox.depth && height == anotherBox.height;
    }

    // add a method to create new box having offset dims from earlier box
    // woff=5.0 , dOff=-1.0 hOff=6.0
    public Box createNewBox(double wOff, double dOff, double hOff) {
        System.out.println("this hashcode " + this.hashCode());
        Box newBox = new Box(width + wOff, this.depth + dOff, this.height + hOff);
        System.out.println("newbox hashcode " + newBox.hashCode());
        return newBox;
    }

    // add a getter for color : to access it from the tester code.
    public String getColor() {
        return color;
    }
    //add getter n setter for Box's width
    public double getWidth()
    {
    	return width;
    }
    public void setWidth(double width)
    {
    	this.width=width;
    }
}