package geometry;

public interface Transformable {
	void move(double x, double y);
	void rotateLeft();
	void rotateRight();
	void scale(double factor);
}
