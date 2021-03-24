package geometry;

public class ShapeCircle extends Shape {
	private double radius;
	
	public ShapeCircle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.printf("Ungueltiger Wert fuer Radius, der Radius wurde von %f.2 auf den Betrag von %f.2 gesetzt.", this.radius, radius);
			this.radius = radius * (-1);
		}
	}

	@Override
	public void rotateLeft() {
		System.out.println("Kreis gedreht");
	}

	@Override
	public void rotateRight() {
		System.out.println("Kreis gedreht");
	}

	@Override
	public void scale(double factor) {
		setRadius(getRadius() * factor);
	}

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public String toString() {
		return "Kreis mit der Fläche " + getArea();
	}
}