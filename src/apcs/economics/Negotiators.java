/**
 * 
 */
package apcs.economics;

/**
 * @author ggrivera
 *
 */
public class Negotiators 
{
	private ConsumerCurve consumer;	
	private ProducerCurve producer;
	
	public Negotiators()
	{
		consumer = new ConsumerCurve();
		producer = new ProducerCurve();
	}
	
	public Negotiators(int np, double m, double b, int dx)
	{
		consumer = new ConsumerCurve(np, m, b, dx);
		producer = new ProducerCurve(np, m, b, dx);
	}
	
	public Point respondToBid(Point point)
	{
		if (producer.contain(point) == consumer.contain(point))
		{
			return point;
		}
		
		//if (producer.contain(point) > )
		
		return point;
	}
}
