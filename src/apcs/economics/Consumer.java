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
		point = null;
				
		if (consumer.contain(point) == true)
		{
			return point;
		}
		else
		{
			
		}
		
		return point;
	}
}
