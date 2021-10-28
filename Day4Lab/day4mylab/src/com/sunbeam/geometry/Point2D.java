package com.sunbeam.geometry;


public class Point2D {
    public int xco, yco;
    static int index=0;
    
    public Point2D(int x, int y) {
        this.xco = x;
        this.yco = y;
    }

    public String getDetails() {
    	
        return "Point "+(++index)+" Co-ordinates are " + xco + " & " + yco;
    }

    public boolean isEqual(Point2D p2) {
        return this.xco == p2.xco && this.yco == p2.yco;
    }

    public double calcDistance(Point2D p2) {
        return Math.sqrt(Math.pow(this.xco - p2.xco, 2) + 
        		Math.pow(this.yco - p2.yco, 2));
    }
}