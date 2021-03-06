package apcs.economics;

import java.util.ArrayList;

/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 * A class that is abstract to form curves
 */
public abstract class AbstractCurve 
{
	private ArrayList<Point> curvePoints;
	
	public AbstractCurve(int np, double m, double b, int dx)
	{
		this.curvePoints = new ArrayList<Point>(np);
		
		// this does the slope of the curve
		for (int i = 0; i < np; i++)
		{
			int x = i * dx;
			double y = m * x + b;
			Point tBA = new Point(x,y);
			this.curvePoints.add(tBA);
		}
	}
	
	/**
	 * removes a point
	 * @param point
	 * @return
	 */
	public boolean remove(Point point)
	{
		this.curvePoints.remove(point);
		return true;
	}
	
	/**
	 * adds a point depending on the x of quantity of point
	 * @param point
	 * @return
	 */
	public boolean add(Point point)
	{

		boolean temp = false;
		
		if(this.searchByX(point) != -1)
		{
			this.curvePoints.set(this.searchByX(point), point);
			
			temp = true;
		}
		if(this.contain(point) == false)
		{
			this.curvePoints.add(point);
			temp = true;
		}
		this.sort();
		return temp;
	}
	
	/**
	 * shows what the index contains
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
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "[" +curvePoints +"]";
	}
	
	/*
	 * does sort in the subclass
	 */
	public abstract void sort();
	
	/**
	 * gets the arraylist
	 * @return
	 */	
	public ArrayList<Point> getList()
	{
		return this.curvePoints;
	}
	
	public Point getPoint()
	{
		sort();
		return curvePoints.get(0);
	}

	/**
	 * searches a point by x
	 * @param point
	 * @return
	 */
	private int searchByX(Point point)
	{	
		int sameX = -1;
		
		if(this.curvePoints.contains(point) == false)
		{
			for (int x = 0; x < this.curvePoints.size(); x++)
			{
				if(this.curvePoints.get(x).getQuantity() 
						== point.getQuantity())
				{
					sameX = x;
					x = curvePoints.size();
				}
			}
		}
		return sameX;	
	}
}
//TODO fix add to which it has to use the search by x method
//FIXME fix the naming of the old curves and change the new curve to normal

