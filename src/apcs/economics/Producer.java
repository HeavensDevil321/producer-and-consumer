/**
 * 
 */
package apcs.economics;

/**
 * @author ggrivera
 *
 */
public class Producer 
{
	private ProducerCurve producer;
	
	public Producer()
	{
		producer = new ProducerCurve();
	}
	
	public Producer(int np, double m, double b, int dx)
	{
		producer = new ProducerCurve(np, m, b, dx);
	}
	
	public Point respondToBid(Point point)
	{
		point = null;
				
		if (producer.contain(point) == true)
		{
			return point;
		}
		else
		{
			
		}
		
		return point;
	}
}
