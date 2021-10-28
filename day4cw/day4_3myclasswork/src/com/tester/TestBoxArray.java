package com.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.sunbeam.core.Box;

/*
 * Create a tester class  : TestBoxArray : "com.tester"

Objective : Ask user(client) , how many boxes to make ?
Accept Box dims 
Store these details suitably.
1. Display using single for-each loop, box dims n volume

2. Double box width for all boxes having volume > 100.(USE for-each & solve this)
 */
public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many boxes you want to order?");
		Box[] boxes;//array type of ref var => boxes can refer to ---> an array object containing refs of Box
		boxes=new Box[sc.nextInt()];//1 object : array (holder) : 10
		System.out.println(Arrays.toString(boxes));
		System.out.println("Name of the array cls loaded "+boxes.getClass());
		//accept box dims --create box cls instance --add the box ref in the array
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims : w d h");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		//Display using single for-each loop, box dims n volume
		for(Box b : boxes)//b=boxes[0], b=boxes[1]
			System.out.println(b.getBoxDimensions()+" volume "+b.getBoxVolume());
		System.out.println("Printing array contents again : ");
		System.out.println(Arrays.toString(boxes));
	//	boxes=null;//How many objs will be marked for GC ?
		//Double box width for all boxes having volume > 100.(USE for-each & solve this)
		for(Box b : boxes)
			if(b.getBoxVolume() > 100)
				b.setWidth(b.getWidth()*2);
		//display box details using for-each
		System.out.println("Printing box details : after  ");
		for(Box b : boxes)
			System.out.println(b.getBoxDimensions());
		sc.close();

	}

}

