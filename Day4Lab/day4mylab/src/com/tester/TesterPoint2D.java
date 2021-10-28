package com.tester;

import java.util.Scanner;
import com.sunbeam.geometry.Point2D;

public class TesterPoint2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of points to plot");
        Point2D[] points = new Point2D[sc.nextInt()];

        for(int i=0;i<points.length;i++) {
        	System.out.println("Enter X, Y for point index "+i);        	
        	points[i] = new Point2D(sc.nextInt(), sc.nextInt());
        }
        
        boolean exit = false;
        
        while(!exit) {
        	System.out.println("\nSelect Operation to be performed: ");
        	System.out.println("1.Enter the point ID from 0 to "+(points.length-1)+" to display details.");
        	System.out.println("2.Display all points.");
        	System.out.println("3.Submit 2 Point IDs to check distance between them.");
        	System.out.println("4.Exit");
        	
        	switch(sc.nextInt()) {
        	case 1:
        		//System.out.println("Enter Point ID from 0 to "+(points.length));
        		int pointID = sc.nextInt();
        		if(pointID>=0 && pointID<points.length) {
        			System.out.println("Point Co-Ordinates are: "+points[pointID].xco+" "+points[pointID].yco);
        		}else {
        			System.out.println("Invalid Point.");
        			break;
        		}
        		break;
        	case 2:
        		for(Point2D p : points) {
        			System.out.println(p.getDetails());
        			
        		}
        		break;
        	case 3:
        		System.out.println("Enter 2 point indexes from 0 to "+(points.length-1)+" to find distance between: ");
        		int p1=sc.nextInt();
        		int p2=sc.nextInt();
        		if((p1>=0 && p1<points.length)&&(p2>=0 && p2<points.length)) {
        				if(points[p1].isEqual(points[p2])) {
        					System.out.println("Both points are same.");
        				}else {	
        					System.out.println("Distance between both points is " + points[p1].calcDistance(points[p2]));		
        				}
        		}else {
        			System.out.println("One of the point does not exist.");
        		}
        		break;
        	case 4:
        		exit=true;
        		break;
        	default: 
        		break;
        	}
        }
   


        sc.close();
    }
}
