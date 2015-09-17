package apcs.economics;

import java.util.Arrays;

/**
 * 
 * @author German
 *
 */
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
		super();// Inherits to parent class
		this.curvePoints = curvePoints;
	}
	
	/**
	 * Inserts a point into the curve array. Size of array increases.
	 * @param point the Point to be added to the array
	 * @param index the location of the new Point
	 */
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
				else if (index == this.curvePoints.length - 1)//FIXME bug?
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
	
	public Point[] deletePointInCurve(Point point)
	{
		Point[] temp = null;
		
		// If the point exist / is within the curve
		//  then get index of point
		//  then delete at index
		// else ignore delete		
		return temp;
	}
	
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

	public int getSizeOfCurve()
	{
		return this.curvePoints.length;
	}
	
	public int getIndexOf(Point point)
	{
		//TODO returns the index of the given point in the curve
		return 0;
	}
	
	public Point getPointInCurve(int index)
	{
		if ((index < this.curvePoints.length) && (index > 0))
		{
			return this.curvePoints[index];
		}
		
		return null;
	}
	
	public boolean isPointInCurve(Point point)
	{
		//TODO returns true if the point exist within the curve
		return false;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
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
	 *  
	 * @param index
	 * @return
	 */
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
