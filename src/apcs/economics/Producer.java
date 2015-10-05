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
		Point conPoint = null;
						
		if (producer.contain(point) == true)
		{
			return point;
			
	
		}
		else
		{
			//for(int i = 0; i < procurve.getCurve().size(); i++)
			//{
			//		if(procurve.getQuantity(i) ect. ?
		}		
		return point;
	}
}
