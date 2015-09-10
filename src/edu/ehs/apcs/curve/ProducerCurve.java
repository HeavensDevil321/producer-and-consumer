package edu.ehs.apcs.curve;

import edu.ehs.apcs.point.Point;

public class ProducerCurve 
{
	private Point[] curvePoints;
	
	private static final int DEFAULT_ARRAY_SIZE = 10;
	
	/**
	 * Constructor method
	 * Instantiated curvePoints to an array of 10 Points
	 */
	public ProducerCurve()
	{
		super();
		this.curvePoints = new Point[DEFAULT_ARRAY_SIZE];
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
	 * 
	 * @param point the Point to be added to the array
	 * @param index the location of the new Point
	 */
	public void addPointToCurve(Point point, int index)
	{
		
		// Assume when the index is first
		// Assume when the index is last
		// Assume when the index is in the middle
		// Assume when the index exceeds the current array size
		
		// Assume the array is empty and the curve array exists
		if (isEmpty() && this.curvePoints != null) {
			if (index < this.curvePoints.length)
			{
				setPoint(point, index);
			}
			else // (index >= this.curvePoints.lenth) 
			{
				Point[] oldCurve = copyCurve(this.curvePoints);
				Point[] newCurve = new Point[index + 1];
				
			}
		}
	}
	
	private Point[] addPoint(Point point, int index)
	{
		Point[] newCurve = null;
		
		if(index < this.curvePoints.length) // Index with in bounds
		{
			newCurve = new Point[index + 1];
			
			for(int x = 0; x < this.curvePoints.length; x++)
			{
				if(x == index)
				{
					newCurve[index] = point;
					newCurve[x +1] = this.curvePoints[x];
				}
				else if(x < index)
				{
					newCurve[x] = this.curvePoints[x];
				}
				else
				{
					newCurve[x + 1] = this.curvePoints[x];
				}
			}
			
		}
		return newCurve;
	}
	
	/**
	 * Appends a single point to the beginning of the curve
	 * @param point
	 * @return Point[] newCurve
	 */
	private Point[] addPointToBeginningOfCurve(Point point)
	{
		Point[] newCurve = new Point[this.curvePoints.length + 1];
		newCurve[0] = point;
		
		for (int x = 1; x < newCurve.length; x++)
		{
			newCurve[x] = this.curvePoints[x - 1];
		}
		return newCurve;
	}
	
	
	/**
	 * Appends a single point to the end of the curve
	 * @param point
	 * @return Point[] newCurve
	 */
	private Point[] addPointToEndOfCurve(Point point)
	{
		Point[] newCurve = new Point[this.curvePoints.length + 1];
		newCurve[newCurve.length - 1] = point;
		
		for(int x = 0; x < newCurve.length - 1; x++)
		{
			newCurve[x] = this.curvePoints[x];
		}
		return newCurve;
	}
	
	public Point[] copyCurve(Point[] curve)
	{
		Point[] copy = curve;
		return copy;
	}
	
	public Point[] deletePointAtBeginningOfCurve(Point point)
	{
		Point[] newCurve = new Point[this.curvePoints.length - 1];
		// go over this with bro
		// and ask about search point
		
		for(int x = 0; x < newCurve.length; x++)
		{
			if (!(this.curvePoints[x] == this.curvePoints[x]))
			{
				newCurve[x] = this.curvePoints[x - 1];
			}
		}
		return newCurve;
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
	
	/**
	 * Check if array is empty 
	 */
	public boolean isEmpty()
	{
		if (this.curvePoints == null)
		{
			return true;
		}
		else
		{
			for(int x = 0; x < this.curvePoints.length; x++)
			{
				if (this.curvePoints[x] != null)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	
}
