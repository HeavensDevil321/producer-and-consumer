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
		this.curvePoints = new ArrayList<Point>();
		
		for(int x = 0; x < 10; x++)
		{
			this.curvePoints.add(new Point(x,x)); 
		}
		
		
		//TODO figure out how to do the slope for the abstract but also for PRO and CON curves
	}
	
	public boolean remove(Point point)
	{
		//FIXME Check if it needs more then this
		// this should delete from the beginning
		this.curvePoints.remove(point);
		
		return true;
	}
	
	public boolean add(Point point)
	{
		// adds at the beginning
		// also check if it works
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
		return "[" + curvePoints +"]";
	}
	
	private int searchByX(Point point)
	{
		return 0;
	}
	
	//sorts its self from abstract.
	public abstract void sort();
	//TODO need to do PRO and CON abstract classes with their own sort
	// no bubble sort or bulz? sort
	
	
	
}
