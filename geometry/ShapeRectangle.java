package geometry;

public class ShapeRectangle extends Shape{
	private double height;
	private double width;
	
	public ShapeRectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	private double getWidth() {
		return this.width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	private void swap() {
		double tmp;
		tmp = getHeight();
		setHeight(getWidth());
		setWidth(tmp);
	}
	
	@Override
	public double getArea() {
		double area;
		double width = this.getWidth();
		double height = this.getHeight();
		area = width*height;
		return area;
	}

	@Override
	public void rotateLeft() {
		setXCoordinate(getXCoordinate() - getHeight());
		swap();
	}

	@Override
	public void rotateRight() {
		setYCoordinate(getYCoordinate() - getWidth());
		swap();
	}

	@Override
	public void scale(double factor) {
		setHeight(factor * getHeight());
		setWidth(factor * getWidth());
	}

	@Override
	public String toString() {
		return "Rechteck mit der Fläche " + getArea();
	}
}
