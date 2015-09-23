package apcs.economics;

import java.util.Arrays;

/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 * ProducerCurve with an up hill curve 
 * with array.
 */

//TODO fix the producer curve to the point where it doesn't deal with indexes just uses only points to its specific array slot
//FIXME take out unneeded methods to the class and fix them to make sense
public class ProducerCurve 
{
	private Point[] curvePoints;
	
	// The default size of the ideal array
	private static final int DEFAULT_ARRAY_SIZE = 10;
	
	/**
	 * Constructor method
	 * Instantiated curvePoints to an array of 10 Points
	 */
	public ProducerCurve()
	{
		//FIXME change one of the constructor to do the slope for producer
	}
	public ProducerCurve(int np, double m, double b, int dx)
	{		
		this.curvePoints = new Point[DEFAULT_ARRAY_SIZE];
		
		for (int i = 0; i < np; i++)
		{
			int x = i * dx;
			double y = m * x + b;
			Point tBA = new Point(x,y);
			
		}
	}
	
	/**
	 * Instantiates the curvePoints[] for the ProducerCurve Class
	 * from a Point[]
	 * @param curvePoints
	 */
	public ProducerCurve(Point[] curvePoints) 
	{
		
		this.curvePoints = curvePoints;
	}
	
	/**
	 * Inserts a point into the curve array. Size of array increases.
	 * @param point the Point to be added to the array
	 * @param index the location of the new Point
	 */
	//make this to only add point
	public void addPointToCurve(Point point, int index)
	{		
		if (this.curvePoints != null) 
		{
			if ((index < this.curvePoints.length) && (index >= 0))
			{				
				if (index == 0)
				{
					addPointToBeginningOfCurve(point);
				}
				else if (index == this.curvePoints.length - 1)
				{
					addPointToEndOfCurve(point);
				}
				else
				{
					addPointToMiddleOfCurve(point, index);
				}
			}
		}	
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
		if ((index < this.curvePoints.length) && (index >= 0))
		{
			this.curvePoints[index] = point;
		}	
	}
	
	/**
	 * Delete a point within bound.
	 * @param index
	 * @return
	 */
	public Point[] deletePointInCurve(int index)
	{
		Point[] temp = null;
		
		if ((index >= 0) && (index < this.curvePoints.length))
		{
			if (index == 0)
			{
				temp = deletePointAtBeginningOfCurve();
			}
			else if (index == this.curvePoints.length - 1)
			{
				temp = deletePointAtEndOfCurve();
			}
			else 
			{
				temp = deletePointAtMiddleOfCurve(index);
			}
		}
		return temp;
	}
	
	/**
	 * UD (undecided)
	 * @param point
	 * @return
	 */
	public Point[] deletePointInCurve(Point point)
	{
		Point[] temp = null;
		
		// If the point exist / is within the curve
		//  then get index of point
		//  then delete at index
		// else ignore delete		
		return temp;
	}
	
	/**
	 * Returns Array of the curve
	 * @return
	 */
	public Point[] getProducerCurveArray()
	{
		return this.curvePoints;
	}
	
	/**
	 * Creates copy of given Point[]
	 * @param curve sets curve as an array of points
	 * @return Point[]
	 */
	public Point[] copyCurve(Point[] curve)
	{
		Point[] copy = curve;
		return copy;
	}
	
    /**
     * Returns size of the array
     * @return
     */
	public int getSizeOfCurve()
	{
		return this.curvePoints.length;
	}
	
//	/**
//	 * Returns the index of the given point in the curve
//	 * @param point
//	 * @return
//	 */
//	public int getIndexOf(Point point)
//	{
//		//TODO returns the index of the given point in the curve
//		return 0;
//	}
	
	/**
	 * Returns the Point of the given index in the curve
	 * @param index
	 * @return
	 */
	public Point getPointInCurve(int index)
	{
		if ((index < this.curvePoints.length) && (index > 0))
		{
			return this.curvePoints[index];
		}
		
		return null;
	}
	
	/**
	 * To check if a point is in the array.
	 * @param point
	 * @return
	 */
	public boolean isPointInCurve(Point point)
	{
		//TODO returns true if the point exist within the curve
		return false;
	}
	
	/**
	 * Check if array is empty 
	 */
	//TODO FIXME  need to create a search or contain method
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
	
	public boolean searchPoint()
	{
		for(int i = 0; i < this.curvePoints.length; i++)
		{
			
		}
		return false;
	}
	
	/** 
	 * to String to layout the array in console
	 */
	@Override
	public String toString() 
	{
		return "ProducerCurve [curvePoints=" + Arrays.toString(curvePoints)
				+ "]";
	}
		
	/**
	 * Makes a new array curve that has one more index then the old curve
	 * and move down the old point and the new point to the new curve.
	 * @param point
	 * @param index
	 * @return
	 */
	private void addPointToMiddleOfCurve(Point point, int index)
	{
		Point[] newCurve = null;
		
		if ((index < this.curvePoints.length) && (index >= 0)) // Index with in bounds
		{
			newCurve = new Point[index + 1];
			
			for (int x = 0; x < this.curvePoints.length; x++)
			{
				if (x == index)
				{
					newCurve[index] = point;
					newCurve[x +1] = this.curvePoints[x];
				}
				else if (x < index)
				{
					newCurve[x] = this.curvePoints[x];
				}
				else
				{
					newCurve[x + 1] = this.curvePoints[x];
				}
			}
			
			this.curvePoints = newCurve;
		}
	}
	
	/**
	 * Appends a single point to the beginning of the curve
	 * @param point
	 * @return Point[] newCurve
	 */
	private void addPointToBeginningOfCurve(Point point)
	{
		Point[] newCurve = new Point[this.curvePoints.length + 1];
		newCurve[0] = point;
		
		for (int x = 1; x < newCurve.length; x++)
		{
			newCurve[x] = this.curvePoints[x - 1];
		}
		
		this.curvePoints = newCurve;
	}
		
	/**
	 * Appends a single point to the end of the curve
	 * @param point
	 * @return Point[] newCurve
	 */
	private void addPointToEndOfCurve(Point point)
	{
		Point[] newCurve = new Point[this.curvePoints.length + 1];
		newCurve[newCurve.length - 1] = point;
		
		for(int x = 0; x < newCurve.length - 1; x++)
		{
			newCurve[x] = this.curvePoints[x];
		}
		
		this.curvePoints = newCurve;
	}
		
	/**
	 * Makes a new array that has one less then then ignores the beginning point and 
	 * copies down the rest of the old curve to the new
	 * @param point
	 * @return
	 */
	private Point[] deletePointAtBeginningOfCurve()
	{
		Point[] newCurve = new Point[this.curvePoints.length - 1];
		
		for(int x = 0; x < newCurve.length; x++)
		{
			newCurve[x] = this.curvePoints[x = 1];
		}
		return newCurve;
	}
	
	/**
	 * Makes an array thats is -1 of the curvePoints
	 * @param index
	 * @return
	 */
	//FIXME switch index to point 
	private Point[] deletePointAtMiddleOfCurve(int index)
	{
		Point[] newCurve = new Point[this.curvePoints.length-1];
		
		for(int x = 0; x < newCurve.length; x++)
		{			
			if(x != index)
			{
				if(x < index)
				{
					newCurve[x] = this.curvePoints[x];
				}
				
				if(x > index)
				{
					newCurve[x - 1] = this.curvePoints[x];
				}
			}				
		}
		return newCurve;
	}
	
	/**
	 * Deletion of point at the end of the array
	 * @return
	 */
	private Point[] deletePointAtEndOfCurve()
	{
		Point[] newCurve = new Point[this.curvePoints.length - 1];
		
		for(int x = 0; x < newCurve.length; x++)
		{
			newCurve[x] = this.curvePoints[x];
		}
		return newCurve;
	}		 
}
