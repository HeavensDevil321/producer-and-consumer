/**
 * 
 */
package apcs.economics;

/**
 * @author ggrivera
 *
 */
public class Consumer 
{
	private ConsumerCurve consumer;
	
	public Consumer()
	{
		consumer = new ConsumerCurve();
	}
	
	public Consumer(int np, double m, double b, int dx)
	{
		consumer = new ConsumerCurve(np, m, b, dx);
	}
	
	public Point respondToBid(Point point)
	{
		Point p1 = null;
		
		int temp = 0;
						
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
