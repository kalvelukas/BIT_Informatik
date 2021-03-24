package geometry;

public class Vector2D extends Vector implements Comparable<Vector2D>{

	private double vector[] = new double[2];
	
	public Vector2D(double x, double y) {
		this.vector[0] = x;
		this.vector[1] = y;
	}

	public double getXCoord() {
		return this.vector[0];
	}

	public double getYCoord() {
		return this.vector[1];
	}

	@Override
	public double getLength() {
		return Math.sqrt(getXCoord()*getXCoord() + getYCoord() * getYCoord());
	}
	
	public void setXCoord(double xCoord) {
		this.vector[0] = xCoord;		
	}

	public void setYCoord(double yCoord) {
		this.vector[1] = yCoord;		
	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub
		
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
		setXCoord(factor * getXCoord());
		setYCoord(factor * getYCoord());		
	}

	@Override
	public int compareTo(Vector2D o) {
		if (o.getLength() > this.getLength()) {
			return -1;
		} else if (o.getLength() < this.getLength()) {
			return 1;
		} else {
			return 0;
		}
	}
}
