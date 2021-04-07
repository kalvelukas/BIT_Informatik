package geometry;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestRectangle {

	static final double TOL = 0.000001;
	
	@Test
	void testGetters() {
		double x = 1.0;
		double y = 1.0;
		double width = 2;
		double height = 2;
		Rectangle testRectangle = new Rectangle(x, y, width, height);
		
		assertEquals(x, testRectangle.getXCoordinate(), TOL);
		assertEquals(y, testRectangle.getYCoordinate(), TOL);
		assertEquals(width, testRectangle.getWidth(), TOL);
	}
	
	@Test
	void testScale() {
		double x = 1.0;
		double y = 1.0;
		double width = 3;
		double height = 5;
		double factor = 2;
		Rectangle testRectangle = new Rectangle(x, y, width, height);
		
		testRectangle.scale(factor);
		assertEquals(width*factor, testRectangle.getWidth(), TOL);
		assertEquals(height*factor, testRectangle.getHeight(), TOL);
	}

	@Test
	void testToString() {
		double x = 1.0;
		double y = 1.0;
		double width = 3;
		double height = 5;
		Rectangle testRectangle = new Rectangle(x, y, width, height);
		
		assertEquals("Rechteck mit der Fläche 15.0", testRectangle.toString());
	}
}