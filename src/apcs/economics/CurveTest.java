package apcs.economics;


import static org.junit.Assert.*;

import org.junit.Test;

public class CurveTest 
{

	int numberOfPoints = 4;
	double m = 2.0;
	double b_prod = 0.0;
	double b_cons = numberOfPoints*m;
	int deltax = 10;
	
	AbstractCurve proCurve1 = new AbstractProducerCurve(); // (0,0) (1,1)...(9,9) default producer (increasing)
	AbstractCurve proCurve2 = new AbstractProducerCurve(numberOfPoints,m,b_prod,deltax);   // (0,0) (10,20), (20,40) (30,60)	
	AbstractCurve conCurve1 = new AbstractConsumerCurve();  // (10,0) (9,1)...(1,9) (decreasing)
	AbstractCurve conCurve2 = new AbstractConsumerCurve(numberOfPoints,-m,b_cons,deltax); // (40,0) (30,10) (20,20) (10,10)


	@Test
	public void setup()
	{

		
		for (int i=0; i<numberOfPoints; i++)
		{
			int x = i*deltax;
			double yu = x*m + b_prod; // increasing y for producer
			double yd = x*(-m) + (b_cons); // decreasing y for consumer
			
			Point tpu = new Point(x,yu); // increasing points for producer
			Point tpd = new Point(x,yd); // decreasing points for consumer
			
			System.out.println(proCurve1.toString());
			System.out.println(conCurve1.toString());
			assertTrue(proCurve2.contain(tpu));
			assertTrue(conCurve2.contain(tpd));
		}
	}
	
	@Test
	public void testAdd() 
	{
		
		// default curves add to end
		Point p1 = new Point (100,100);
		conCurve1.add(p1);
		assertTrue(conCurve1.contain(p1));
		proCurve1.add(p1);
		assertTrue(proCurve1.contain(p1));
		
		// custom curves add in middle
		p1 = new Point (15,100);
		conCurve2.add(p1);
		assertTrue(conCurve2.contain(p1));
		proCurve2.add(p1);
		assertTrue(proCurve2.contain(p1));
		
		// custom curves add (replace)
		p1 = new Point (10,100);
		conCurve2.add(p1);
		assertTrue(conCurve2.contain(p1));
		proCurve2.add(p1);
		assertTrue(proCurve2.contain(p1));
	}

	@Test
	public void testRemove() 
	{
		
		
		
		Point p1 = new Point(0,0);
		assertTrue(proCurve1.contain(p1));

		// delete the first point in a default curve
		proCurve1.remove(p1);
		assertFalse(proCurve1.contain(p1));
		
		// delete the middle point
		p1 = new Point(5,5);
		assertTrue(proCurve1.contain(p1));
		proCurve1.remove(p1);
		assertFalse(proCurve1.contain(p1));	
		
		// delete last point
		p1 = new Point(9,9);
		assertTrue(proCurve1.contain(p1));
		proCurve1.remove(p1);
		assertFalse(proCurve1.contain(p1));	
		
		// delete last point of other curve
		p1 = new Point(30,60);
		assertTrue(proCurve2.contain(p1));
		proCurve2.remove(p1);
		assertFalse(proCurve2.contain(p1));	
		
		// delete non-existent point of other curve
		p1 = new Point(20,50);
		assertFalse(conCurve2.contain(p1));
		conCurve2.remove(p1);
		assertFalse(conCurve2.contain(p1));			
	}

	@Test
	public void testContains() 
	{
		
		// verify that default constructor works.
		for (int i=0; i<10; i++)
		{
			Point p2 = new Point(i,i);
			//System.out.println(p2+" Contains: "+proCurve1);
			assertTrue(proCurve1.contain(p2));
		}
		
		// verify that a point is not found on the default curve
		Point p1 = new Point (100,100);
		assertFalse(proCurve1.contain(p1));
		
	}

}
