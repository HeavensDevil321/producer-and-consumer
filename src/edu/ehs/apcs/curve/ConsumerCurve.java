package edu.ehs.apcs.curve;

import edu.ehs.apcs.point.Point;

import java.util.ArrayList;

/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 * 
 *
 */
public class ConsumerCurve 
{
	private ArrayList<Point> curvePoint;
	private Point conPoint[];
	
	public ConsumerCurve()
	{
		conPoint = new Point[10];
		
		
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("hello" + conPoint[i]);
		}
	}
	
}
//TODO get consumer working 
