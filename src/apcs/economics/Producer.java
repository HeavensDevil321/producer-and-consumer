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
						
		//checks if the point is there
		if (producer.contain(point) == true)
		{
			p1 = point;
		}
					
		//below the curve
		if (point.getPrice() < p1.getPrice())
		{
			return null;
		}
		//above the curve
		if (point.getPrice() > p1.getPrice())
		{
			return point;
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
		return "(" + producer + ")";
	}
	
	
}
