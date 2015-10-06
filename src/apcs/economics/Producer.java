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
	private ProducerCurve curvePoint;
	
	public Producer()
	{
		curvePoint = new ProducerCurve();
	}
	
	public Producer(int np, double m, double b, int dx)
	{
		curvePoint = new ProducerCurve(np, m, b, dx);
	}
	
	public Point respondToBid(Point point)
	{
		Point p1 = null;
		
		int temp = 0;
						
		if (curvePoint.contain(point) == true)
		{
			p1 = point;
		}
		else
		{
			for(int i = 0; i < curvePoint.getList().size(); i++)
			{
				
				if(curvePoint.getList().get(i).getQuantity() == point.getQuantity())
				{
					if (curvePoint.getList().get(i).getPrice() < point.getPrice())
					{
						p1 = point;
					}
					else
					{
						p1 = curvePoint.getList().get(i);
					}
					if (curvePoint.getList().get(i).getQuantity() > point.getQuantity())
					{
						p1 = point;
					}
				}
				
				
			}
		}		
		return point;
	}
}
