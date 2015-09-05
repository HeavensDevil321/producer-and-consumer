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
	
	/**
	 * Replace the specified point at the array index
	 * If the index passed is larger than the array length,
	 * it will not set the point
	 * @param point the Point to set
	 * @param index the index of the array
	 */
	public void setPoint(Point point, int index) 
	{
		if (index < this.curvePoints.length)
		{
			this.curvePoints[index] = point;
		}	
	}
}
