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
		Point p1 = null;
		
		if (consumer.contain(point) == true)
		{
			p1 = point;
		}
		else
		{
			for(int i = 0; i < consumer.getList().size(); i++)
			{
				
				if(consumer.getList().get(i).getQuantity() == point.getQuantity())
				{
					if (consumer.getList().get(i).getPrice() < point.getPrice())
					{
						p1 = point;
					}
					else
					{
						p1 = consumer.getList().get(i);
					}
					if (consumer.getList().get(i).getPrice() > point.getPrice())
					{
						p1 = point;
					}
				}
				
				if (consumer.getList().get(i).getQuantity() < point.getQuantity())
				{
					p1 = point;
				}
				if (consumer.getList().get(i).getQuantity() > point.getQuantity())
				{
					p1 = point;
				}
			}
		}				
		return point;
	}
}
