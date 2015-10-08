/**
 * 
 */
package apcs.economics;

/**
 * @author german rivera
 * Producer is the seller of the market
 */
public class Producer 
{
	private ProducerCurve producer;
	
	/**
	 * Instantiate the producer
	 */
	public Producer()
	{
		producer = new ProducerCurve();
	}
	
	/**
	 * constructor that deals with the slope
	 * @param np
	 * @param m
	 * @param b
	 * @param dx
	 */
	public Producer(int np, double m, double b, int dx)
	{
		producer = new ProducerCurve(np, m, b, dx);
	}
	
	/**
	 * this is the response of the producer to the bid
	 * @param point
	 * @return
	 */
	public Point respondToBid(Point point)
	{
		Point p1 = producer.getPoint();
		
		producer.remove(point);
			
		
		// on the equilibrium
		if (point.equals(p1))
		{
			System.out.println("on 5,5");
			return point;
		}
		
		//below the curve
		if (point.getPrice() < p1.getPrice())
		{
			System.out.println("below the curve");
			return null;
			
		}
		
		//above the curve
		if (point.getPrice() > p1.getPrice())
		{
			System.out.println("above the curve");
			return point;
		}
		
		
		
		return point;
	}
}
