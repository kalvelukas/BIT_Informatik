package geometry;

public class Square extends Shape{
	private double width;
	
	public Square(double x, double y, double width) {
		super (x, y);
		this.width = width;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double getArea() {
		double area;
		setWidth(getWidth());
		area = width*width;
		return area;
	}

	@Override
	public void rotateLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotateRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scale(double factor) {
		setWidth(getWidth() * factor);
	}

	@Override
	public String toString() {
		return "Quadrat mit der Fläche " + getArea();
	}
}
