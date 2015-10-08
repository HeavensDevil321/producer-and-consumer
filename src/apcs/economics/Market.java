/**
 * 
 */
package apcs.economics;

/**
 * @author german rivera
 *
 */
public class Market 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Producer pc = new Producer();
		Consumer cn = new Consumer();
		Point temp = new Point(5,5);
		Point temp2 = new Point(1,5);
		Point temp3 = new Point(4,4);
		Point temp4 = new Point(4,3);
		Point temp5 = new Point(2,1);
		
		System.out.println("Producer responding to the bid:");
		
//		pc.respondToBid(new Point (0,0));
//		pc.respondToBid(new Point (0,0));
		pc.respondToBid(temp2);
//		pc.respondToBid(new Point (0,0));
//		pc.respondToBid(new Point (0,0));
		pc.respondToBid(temp);
//		pc.respondToBid(new Point (0,0));
//		pc.respondToBid(new Point (0,0));
		pc.respondToBid(temp3);
//		pc.respondToBid(new Point (0,0));
//		pc.respondToBid(new Point (0,0));
		pc.respondToBid(temp5);
		
		
		System.out.println("Consumer responding to the bid:");
		
		cn.respondToBid(temp2);
		cn.respondToBid(new Point (0,0));
		cn.respondToBid(new Point (0,0));
		cn.respondToBid(temp);
		cn.respondToBid(new Point (0,0));
		cn.respondToBid(new Point (0,0));
		cn.respondToBid(temp3);
		cn.respondToBid(new Point (0,0));
		cn.respondToBid(new Point (0,0));
		cn.respondToBid(temp4);
		
		
	}

}
