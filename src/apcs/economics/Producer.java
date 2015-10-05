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
	private ProducerCurve curvePoints;
	
	public Producer()
	{
		curvePoints = new ProducerCurve();
	}
	
	public Producer(int np, double m, double b, int dx)
	{
		curvePoints = new ProducerCurve(np, m, b, dx);
	}
	
	public Point respondToBid(Point point)
	{
		Point p1 = null;
		
		int temp = 0;
						
		if (curvePoints.contain(point) == true)
		{
			p1 = point;
		}
		else
		{
			for(int i = 0; i < curvePoints.getList().size(); i++)
			{
				
				if(curvePoints.getList().get(i).getQuantity() == point.getQuantity())
				{
					if (curvePoints.getList().get(i).getPrice() < point.getPrice())
					{
						p1 = point;
					}
					else
					{
						p1 = curvePoints.getList().
					}
				}
				
				
			}
		}		
		return point;
	}
}
