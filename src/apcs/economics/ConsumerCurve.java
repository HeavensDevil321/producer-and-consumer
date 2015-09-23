package apcs.economics;

import java.util.ArrayList;


/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 * Consumer Curve as ArrayList with
 * down hill slope
 *
 */
public class ConsumerCurve 
{
	private ArrayList<Point> curvePoints;
	
	private static final int DEFAULT_ARRAY_SIZE = 10;

	/**
	 * @param curvePoints
	 */
	public ConsumerCurve(ArrayList<Point> curvePoints) 
	{		
		for(int x = 0; x < DEFAULT_ARRAY_SIZE; x++)
		{
			this.curvePoints.add(new Point(0,0)); 
		}
	
		this.curvePoints = curvePoints;
	}

	/**
	 * construct a default size of the array with 
	 * each index contain point
	 */

	//FIXME make one of the constructor to do the slope of the curve
	//FIXME make linear curve 0,0 thro 9,9
	public ConsumerCurve(int np, double m, double b, int dx) 
	{
		this.curvePoints = new ArrayList<Point>(np);
		
		for (int i = 0; i < np; i++)
		{
			int x = i * dx;
			double y = m * x + b;
			Point tBA = new Point(x,y);
			this.curvePoints.add(tBA);
		}
		
	}

	/**
	 * search if point don't exist in array then add point
	 * @param point
	 * @param index
	 */
	public void add(Point point, int index)
	{
			// check if the point exists
			if (!(contain(point)))
			{
				this.curvePoints.add(index, point);
			}			
	}
	
	/**
	 * deletion of point
	 * @param index
	 */
	public void remove(int index)
	{
		if ((index >= 0) && (index < this.curvePoints.size()))
		{
			this.curvePoints.remove(index);
		}
	}
	
	/**
	 *
	 * @return curvePoints
	 */
	public ArrayList<Point> getList()
	{
		return curvePoints;
		
	}
	
	/**
	 * Find existing points in array
	 * @param point
	 * @return
	 */
	public boolean contain(Point point)
	{
		for (int x = 0; x < this.curvePoints.size(); x++)
		{
			Point tempPoint = this.curvePoints.get(x);
						
			if (tempPoint.equals(point))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * checks if the points are equal
	 * @param point
	 * @param index
	 * @return
	 */
	public boolean equals(Point point, int index)
	{		
		Point tempPoint = this.curvePoints.get(index);
		
		if ((tempPoint.getQuantity() == point.getQuantity()) && (tempPoint.getPrice() == point.getPrice()))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return size of array
	 */
	public int size()
	{
		return this.curvePoints.size();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "[" + curvePoints + "]";
	}	
}
//TODO get consumer working 
