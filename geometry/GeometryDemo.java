package geometry;

import java.util.ArrayList;
import java.util.Collections;

public class GeometryDemo {
	public static void main(String[] args) {
		ArrayList<Shape> areaList = new ArrayList<>();

		areaList.add(new ShapeCircle(9, 123, 89));
		areaList.add(new ShapeSquare(4, 26, 7));
		areaList.add(new ShapeRectangle(1, 2, 3, 7));
		areaList.add(new ShapeRectangle(1, 65, 46, 9));
		areaList.add(new ShapeSquare(1, 2, 35));
		areaList.add(new ShapeRectangle(1, 2, 67, 45));
		areaList.add(new ShapeRectangle(1, 2, 346, 87));
		areaList.add(new ShapeSquare(1, 2, 7));

		double sumArea = 0.0;
		for (Shape shape : areaList) {
			sumArea += shape.getArea();
			System.out.println(shape.toString());
		}
		System.out.println("Total Area " + sumArea);

		Collections.sort(areaList);

		for (Shape shape : areaList) {
			System.out.println(shape.toString());
		}
	}
}
