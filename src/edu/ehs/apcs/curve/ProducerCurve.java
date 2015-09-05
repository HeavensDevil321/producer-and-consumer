package edu.ehs.apcs.curve;

import edu.ehs.apcs.point.Point;

public class ProducerCurve 
{
	private Point[] curvePoints;
	
	/**
	 * Constructor method
	 * Instantiated curvePoints to an array of 10 Points
	 */
	public ProducerCurve()
	{
		super();
		this.curvePoints = new Point[10];
	}
	
	/**
	 * Instantiates the curvePoints[] for the ProducerCurve Class
	 * from a Point[]
	 * @param curvePoints
	 */
	public ProducerCurve(Point[] curvePoints) 
	{
		super();
		this.curvePoints = curvePoints;
	}
}
