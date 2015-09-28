/**
 * 
 */
package apcs.economics;

/**
 * @author german rivera
 * @hour 3rd hr.
 * Consumer Curve that extends to the abstract curve
 * using its methods.
 */
public class AbstractConsumerCurve extends AbstractCurve
{	
	public AbstractConsumerCurve(int np, double m, double b, int dx) 
	{
		super(np, m, b, dx);		
	}
	
	public AbstractConsumerCurve()
	{
		super(10, -1, 10, 1);
	}
	
	
	/**
	 * sorts the quantity by x then y
	 */
	public void sort() 
	{		
		for(int x = 0; x < getList().size(); x++)
		{
			for(int t=0; t < (getList().size() - 1); t++)
			{
				if (getList().get(t).getQuantity() 
						> getList().get(t+1).getQuantity())
				{
					Point temp = getList().get(t);
					getList().set(t,getList().get(t+1));
					getList().set(t + 1,temp);
				}
				if (getList().get(t).getQuantity() 
						== getList().get(t + 1).getQuantity())
				{
					if (getList().get(t).getPrice() 
							> getList().get(t + 1).getPrice())
					{
						Point temp = getList().get(t);
						getList().set(t,getList().get(t+1));
						getList().set(t + 1,temp);
					}
				}			
			}
		}		
	}	
}
