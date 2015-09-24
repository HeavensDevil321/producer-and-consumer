package apcs.economics.testclasses;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Test;

/**
 * @author German G. Rivera
 * @date 8/26/2015
 * @hour 3rd hr.
 * Test for ProducerCurve
 */
public class ProducerCurveTest 
{
//	Point p1 = new Point(4,5);
//	Point p2 = new Point(2,2);
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#ProducerCurve()}.
//	 */
//	@Test
//	public final void testProducerCurve() 
//	{
//		ProducerCurve myProducerCurve = new ProducerCurve();
//		assertNotNull("Object Created.", myProducerCurve);
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#ProducerCurve(apcs.economics.Point[])}.
//	 */
//	@Test
//	public final void testProducerCurvePointArray() 
//	{
//		Point[] curvePoints = new Point[10];
//		ProducerCurve testProducerCurve = new ProducerCurve(curvePoints);
//		assertNotNull("ProducerCurve Created.", testProducerCurve);
//		// FIXME: potentially need to check the curvePoints variable is non-zero in ProdCurve
//		assertTrue("Size of array is non-zero", testProducerCurve.isEmpty()); 
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#addPointToCurve(apcs.economics.Point, int)}.
//	 */
//	@Test
//	public final void testAddPointToCurve() 
//	{
//		Point[] curvePoints = new Point[10];
//		ProducerCurve testProducerCurve = new ProducerCurve(curvePoints);
//		assertNotNull("ProducerCurve Created.", testProducerCurve);
//		
//		assertTrue("Added a point.", testProducerCurve.addPointToCurve(p1, 0));
//		// TODO
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#copyCurve(apcs.economics.Point[])}.
//	 */
//	@Test
//	public final void testCopyCurve() 
//	{
//		Point[] curve1 = new Point[10];
//		ProducerCurve pc1 = new ProducerCurve(curve1);
//		Point[] curve2 = pc1.copyCurve(curve1);
//		assertArrayEquals(curve1, curve2);
//		
//		
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#deletePointAtBeginningOfCurve(apcs.economics.Point)}.
//	 */
//	@Test
//	public final void testDeletePointAtBeginningOfCurve() 
//	{
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#deletePointAtMiddleOfCurve(int)}.
//	 */
//	@Test
//	public final void testDeletePointAtMiddleOfCurve() 
//	{
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#deletePointAtEndOfCurve(apcs.economics.Point)}.
//	 */
//	@Test
//	public final void testDeletePointAtEndOfCurve() 
//	{
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#setPoint(apcs.economics.Point, int)}.
//	 */
//	@Test
//	public final void testSetPoint() 
//	{
//		Point[] pointArray = new Point[10];
//		Point testPoint = new Point(1, 1.0);
//		ProducerCurve testProducerCurve = new ProducerCurve(pointArray);
//		testProducerCurve.setPoint(testPoint, 7);
//		
//		//assertTrue(testProducerCurve.getPoint(7).equals(testPoint));
//		assertEquals(testPoint, testProducerCurve.getPointInCurve(7));
//		
//	}
//
//	/**
//	 * Test method for {@link apcs.economics.ProducerCurve#isEmpty()}.
//	 */
//	@Test
//	public final void testIsEmpty() 
//	{
//		Point[] curvePoints = new Point[10];
//		ProducerCurve testProducerCurve = new ProducerCurve(curvePoints);
//		assertTrue("Curve is Empty.", testProducerCurve.isEmpty());
//		
//		Point testPoint = new Point(1, 1.0);
//		testProducerCurve.addPointToCurve(testPoint, 5);
//		assertFalse("Curve is not empty.", testProducerCurve.isEmpty());
//	}
//
//	public final void testToString()
//	{
//		Point[] curvePoints = new Point[10];
//		ProducerCurve testProducerCurve = new ProducerCurve(curvePoints);
//		
//		
//		assertTrue(testProducerCurve.toString());
//	}
}
