/**
 * 
 */
package apcs.economics.testclasses;

import java.util.ArrayList;

import apcs.economics.ConsumerCurve;
import apcs.economics.Point;

/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 * Testing ConsumerCurve
 */
public class ConsumerCurveTest 
{
		public static void main(String[] args) 
		{
			ConsumerCurve test = new ConsumerCurve();
			
			System.out.println("Size:" + test.size());
			System.out.println("List:" + test.toString());
			
			ArrayList<Point> curvePoints = new ArrayList<Point>(); 			
		
			curvePoints.add(new Point(0, 0.0));
			curvePoints.add(new Point(1, 1.0));
			curvePoints.add(new Point(2, 2.0));
			curvePoints.add(new Point(3, 3.0));
			curvePoints.add(new Point(4, 4.0));
			curvePoints.add(new Point(5, 5.0));
			curvePoints.add(new Point(5, 5.0));
			curvePoints.add(new Point(6, 6.0));
			curvePoints.add(new Point(7, 7.0));
			curvePoints.add(new Point(8, 7.0));			
			curvePoints.add(new Point(4, 5.0));
			
			ConsumerCurve test2 = new ConsumerCurve(curvePoints);
			System.out.println("SIZE & TOSTRING");
			System.out.println("Size:" + test2.size());
			System.out.println("List:" + test2.toString());
			
			
			System.out.println("ADD");

			test2.add(new Point(1, 3.2),  1);
			System.out.println("List:" + test2.toString());
			System.out.println("Size:" + test2.size());
			
			System.out.println("FIND");			
			System.out.println("search point (1,3.2):" + test2.find(new Point(1, 3.2)));
			System.out.println("List:" + test2.toString());
			
			System.out.println("DELETE");
			test2.remove(1);

			test2.addPointInCurve(new Point(1, 3.2),  1);
			System.out.println("List:" + test2.toString());
			System.out.println("Size:" + test2.size());
			
			System.out.println("FIND");			
			System.out.println("search point (1,3.2):" + test2.find(new Point(1, 3.2)));
			System.out.println("List:" + test2.toString());
			
			System.out.println("DELETE");
			test2.deletePointInCurve(1);
			System.out.println("Size:" + test2.size());
			System.out.println("search point (1,3.2):" + test2.find(new Point(1, 3.2)));
			System.out.println("List:" + test2.toString());
						
			System.out.println("are the the point equal:" + test.find(new Point(2,2.3)));	
		}
}