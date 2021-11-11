package com.tester;

import com.sunbeam.core.Box;
import java.util.Scanner;

class TestBoxFunctionality {
    public static void main(String[] args) {
        // create a scanner wrapping console input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st box dims n color : w d h color");
        Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());
        System.out.println("Box 1's addr " + b1.hashCode());
        System.out.println("Enter 2nd box dims n color : w d h color");
        Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());
        System.out.println("Box 2's addr " + b2.hashCode());
        // display same or different : based upon dims
        // type of method arg : ref type var : passed by it's copy
        System.out.println(b1.isEqual(b2) ? "SAME" : "DIFFERENT");
        // create a new box
        System.out.println("Enter offsets in Box 1's dims : woff doff hoff");
        // b1 --> Box 1.0 2.0 3.0 n offsets 5 -1 6
        // method arg type : double : primitive
        Box b3 = b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box 3's addr " + b3.hashCode());
        System.out.println("new box's dims " + b3.getBoxDimensions());
        sc.close();

    }
}