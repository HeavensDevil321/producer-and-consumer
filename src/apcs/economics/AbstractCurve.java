package apcs.economics;

import java.util.ArrayList;

/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 *
 */
public abstract class AbstractCurve 
{
	private ArrayList<Point> curvePoints;
	
	public AbstractCurve(int np, double m, double b, int dx)
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
	
	public boolean remove(Point point)
	{
		this.curvePoints.remove(point);
		return true;
	}
	
	public boolean add(Point point)
	{
		this.curvePoints.add(point);
		return true;
	}
	
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
	
	public String toString()
	{
		return "[" +curvePoints +"]";
	}
	
	public abstract void sort();
	
	
}

