package apcs.economics;

import java.util.Arrays;

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
	
	/**
	 * Makes a new array curve that has one more index then the old curve
	 * and move down the old point and the new point to the new curve.
	 * @param point
	 * @param index
	 * @return
	 */
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
	
	/**
	 * Copies a array curve
	 * @param curve sets curve as an array of points
	 * @return
	 */
	public Point[] copyCurve(Point[] curve)
	{
		Point[] copy = curve;
		return copy;
	}
	
	/**
	 * Makes a new array that has one less then then ignores the beginning point and 
	 * copies down the rest of the old curve to the new
	 * @param point
	 * @return
	 */
	public Point[] deletePointAtBeginningOfCurve(Point point)
	{
		Point[] newCurve = new Point[this.curvePoints.length - 1];
		
		for(int x = 0; x < newCurve.length; x++)
		{
			newCurve[x] = this.curvePoints[x = 1];
		}
		return newCurve;
	}
	
	/**
	 * Makes a new array 
	 * @param index
	 * @return
	 */
	public Point[] deletePointAtMiddleOfCurve(int index)
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
	
	public Point[] deletePointAtEndOfCurve(Point point)
	{
		Point[] newCurve = new Point[this.curvePoints.length - 1];
		
		for(int x = 0; x < newCurve.length; x++)
		{
			newCurve[x] = this.curvePoints[x];
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

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "ProducerCurve [curvePoints=" + Arrays.toString(curvePoints)
				+ "]";
	}
	
	 
}
