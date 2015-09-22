package apcs.economics.testclasses;

import apcs.economics.Point;


/**
 * @author German Rivera
 * @date 8/21/2015
 * Test the point.java by making to 2 points
 * and checks if they are equal
 */
public class TestPoint 
{

	public static void main(String[] args) 
	{
		Point p1 = new Point(3,3.0);  //makes points 1
		Point p2 = new Point(0,-1.00000); // makes point 2
		Object p3 = new Point(3,3); 
		/**
		 * prints them out in the console
		 */
		System.out.println("point one is "+ p1.toString());
		System.out.println("point two is "+ p2.toString());
		System.out.println("point three is "+ p3.toString());
		System.out.println("is p1 = p2?"+ p1.equals(p2));
		System.out.println("is p1 = p3?"+ p1.equals(p3));
	}

}
