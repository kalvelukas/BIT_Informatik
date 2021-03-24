package src.classes.informatik1;

import src.classes.informatik1.geometry.Circle;

public class Mathematics {

	public static void main(String[] args) {
		ShapeCircle circle1 = new ShapeCircle();
		ShapeCircle circle2 = new ShapeCircle(2.5);
		ShapeCircle circle3 = new ShapeCircle(circle2);
		ShapeCircle circle4 = new ShapeCircle(-1.2, 7.1, 3.0);
		
		circle3.getArea();
		
		circle4.setX(2);

		System.out.println("Fläche des Kreises ist: " + circle1.getArea());
		

		System.out.println("Es wurden " + ShapeCircle.count + " Objekte der Klasse Circle erzeugt.");
		
	}
}