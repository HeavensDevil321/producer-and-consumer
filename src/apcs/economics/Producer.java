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
		Point p1 = null;
		
		
						
		if (producer.contain(point) == true)
		{
			p1 = point;
		}
		else
		{
			for(int i = 0; i < producer.getList().size(); i++)
			{
				
				if(producer.getList().get(i).getQuantity() == point.getQuantity())
				{
					if (producer.getList().get(i).getPrice() < point.getPrice())
					{
						p1 = point;
					}
					else
					{
						p1 = producer.getList().get(i);
					}
					if (producer.getList().get(i).getPrice() > point.getPrice())
					{
						p1 = point;
					}
				}
				
				if (producer.getList().get(i).getQuantity() < point.getQuantity())
				{
					p1 = point;
				}
				if (producer.getList().get(i).getQuantity() > point.getQuantity())
				{
					p1 = point;
				}
			}
		}		
		return point;
	}
}
