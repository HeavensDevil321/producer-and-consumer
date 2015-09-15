package edu.ehs.apcs.curve;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import edu.ehs.apcs.point.Point;

/**
 * @author Gabriel
 *
 */
public class ProducerCurveTest {

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#ProducerCurve()}.
	 */
	@Test
	public final void testProducerCurve() {
		ProducerCurve myProducerCurve = new ProducerCurve();
		assertNotNull("Object Created.", myProducerCurve);
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#ProducerCurve(edu.ehs.apcs.point.Point[])}.
	 */
	@Test
	public final void testProducerCurvePointArray() {
		Point[] curvePoints = new Point[10];
		ProducerCurve testProducerCurve = new ProducerCurve(curvePoints);
		assertNotNull("ProducerCurve Created.", testProducerCurve);
		// FIXME: potentially need to check the curvePoints variable is non-zero in ProdCurve
		assertTrue("Size of array is non-zero", testProducerCurve.isEmpty()); 
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#addPointToCurve(edu.ehs.apcs.point.Point, int)}.
	 */
	@Test
	public final void testAddPointToCurve() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#copyCurve(edu.ehs.apcs.point.Point[])}.
	 */
	@Test
	public final void testCopyCurve() {
		Point[] curve1 = new Point[10];
		ProducerCurve pc1 = new ProducerCurve(curve1);
		Point[] curve2 = pc1.copyCurve(curve1);
		assertSame(curve1, curve2);
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#deletePointAtBeginningOfCurve(edu.ehs.apcs.point.Point)}.
	 */
	@Test
	public final void testDeletePointAtBeginningOfCurve() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#deletePointAtMiddleOfCurve(int)}.
	 */
	@Test
	public final void testDeletePointAtMiddleOfCurve() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#deletePointAtEndOfCurve(edu.ehs.apcs.point.Point)}.
	 */
	@Test
	public final void testDeletePointAtEndOfCurve() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#setPoint(edu.ehs.apcs.point.Point, int)}.
	 */
	@Test
	public final void testSetPoint() {
		Point[] pointArray = new Point[10];
		Point testPoint = new Point(1, 1.0);
		ProducerCurve testProducerCurve = new ProducerCurve(pointArray);
		testProducerCurve.setPoint(testPoint, 7);
		
		//assertTrue(testProducerCurve.getPoint(7).equals(testPoint));
		assertSame(testPoint, testProducerCurve.getPoint(7));
	}

	/**
	 * Test method for {@link edu.ehs.apcs.curve.ProducerCurve#isEmpty()}.
	 */
	@Test
	public final void testIsEmpty() {
		Point[] curvePoints = new Point[10];
		ProducerCurve testProducerCurve = new ProducerCurve(curvePoints);
		assertTrue("Curve is Empty.", testProducerCurve.isEmpty());
		
		Point testPoint = new Point(1, 1.0);
		testProducerCurve.addPointToCurve(testPoint, 5);
		assertFalse("Curve is not empty.", testProducerCurve.isEmpty());
	}

}
