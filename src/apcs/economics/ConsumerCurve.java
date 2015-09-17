package apcs.economics;

import java.util.ArrayList;


/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 * 
 *
 */
public class ConsumerCurve 
{
	private ArrayList<Point> curvePoints;
	
	private static final int DEFAULT_ARRAY_SIZE = 10;

	/**
	 * @param curvePoints
	 */
	public ConsumerCurve(ArrayList<Point> curvePoints) {
	
		this.curvePoints = curvePoints;
	}

	/**
	 * 
	 */
	public ConsumerCurve() {
		
		// TODO Auto-generated constructor stub
	}

	

	public void addPointToCurve(Point point, int index)
	{
		
		
	}
	
	public void deletePointToCurve()
	{
		
	}
	
	public ArrayList<Point> get()
	{
		return curvePoints;
		
	}
	
	public int size()
	{
		
	}
	
	
	
}
//TODO get consumer working 
