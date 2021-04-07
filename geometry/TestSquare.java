package geometry;

import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class TestSquare {

	final private double TOL = 0.00001;
	
	@Test
	public void testGetters() {
		double x = 1.0;
		double y = 1.0;
		double width = 2;
		Square testSquare = new Square(x, y, width);
		
		assertEquals(x, testSquare.getXCoordinate(), TOL);
		assertEquals(y, testSquare.getYCoordinate(), TOL);
		assertEquals(width, testSquare.getWidth(), TOL);
	}
}
