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

class Box {
    private double width, depth, height;

    Box(double width, double d, double height) {
        this.width = width;
        depth = d;
        this.height = height;
    }

    String getBoxDimensions() {
        return "Box Dims " + this.width + " " + depth + " " + this.height;
    }

    double getBoxVolume() {
        return width * depth * height;
    }

}