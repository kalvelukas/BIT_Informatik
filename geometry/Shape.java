package geometry;

public abstract class Shape implements Transformable, Comparable<Shape> {
	private double[] basePoint;
	
	public Shape (double x, double y) {
		basePoint = new double[2];
		basePoint[0] = x;
		basePoint[1] = y;
	}
	
	public double getXCoordinate() {
		return this.basePoint[0];
	}

	public double getYCoordinate() {
		return this.basePoint[1];
	}

	public void setXCoordinate(double xCoordinate) {
		this.basePoint[0] = xCoordinate;
	}

	public void setYCoordinate(double yCoordinate) {
		this.basePoint[1] = yCoordinate;
	}
	
	@Override
	public String toString() {
		return String.format("%f, %f", getXCoordinate(), getYCoordinate());
	}
	
	@Override
	public void move(double x, double y) {
		setXCoordinate(getXCoordinate() + x);
		setYCoordinate(getYCoordinate() + y);
	}

	@Override
	public int compareTo(Shape shape) {
		if (this.getArea() > shape.getArea()) {
			return 1;
		} else if (this.getArea() < shape.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

	public abstract double getArea();
//	public abstract boolean equals(Shape shape);
}
