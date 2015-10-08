/**
 * 
 */
package apcs.economics;

/**
 * @author german rivera
 * This is the consumer class in which is the buyer of the market
 * its respond to bids are below the consumer curve or on the curve.
 */
public class Consumer 
{
	private ConsumerCurve consumer;
	
	/**
	 * Instantiate the consumer
	 */
	public Consumer()
	{
		consumer = new ConsumerCurve();
	}
	
	/**
	 * constructor that deals with the slope
	 * @param np
	 * @param m
	 * @param b
	 * @param dx
	 */
	public Consumer(int np, double m, double b, int dx)
	{
		consumer = new ConsumerCurve(np, m, b, dx);
	}
	
	/**
	 * this is the response of the consumer to the bid
	 * @param point
	 * @return
	 */
	public Point respondToBid(Point point)
	{
		Point p1 = consumer.getPoint();
		
		consumer.remove(point);
		
		if (consumer.contain(point) == true)
		{
			p1 = point;
		}
			
		//below the curve
		if (point.getPrice() < p1.getPrice())
		{
			return point;
		}
		//above the curve
		if (point.getPrice() > p1.getPrice())
		{
			return null;
		}
		// on the equilibrium
		if (point.equals(p1))
		{
			return point;
		}
		return point;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "(" + consumer + ")";
	}
	
}
