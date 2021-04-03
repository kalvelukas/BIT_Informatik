package vectors;

public class Vector2D extends Vector {
	private double x, y;
	
	public Vector2D (double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void resize(double factor) {
		this.x *= factor;
		this.y *= factor;
	}
}
