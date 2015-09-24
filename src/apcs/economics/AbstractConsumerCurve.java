/**
 * 
 */
package apcs.economics;

import java.util.ArrayList;

/**
 * @author ggrivera
 *
 */
public class AbstractConsumerCurve extends AbstractCurve
{
	private ArrayList<Point> curvePoints;
	
	public AbstractConsumerCurve(int np, double m, double b, int dx) 
	{
		super(np, m, b, dx);
		
	}


	public void sort() 
	{
		
		
		for(int x = 0; x < getList().size(); x++)
		{
			for(int t=0; t < (getList().size() - 1); t++)
			{
				if (getList().get(t).getQuantity() > getList().get(t+1).getQuantity())
				{
					
				}
			}
		}
		
	}
	
	public ArrayList<Point> getList()
	{
		return this.curvePoints;
	}


	
}
