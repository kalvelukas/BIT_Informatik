package vectors;

public class Vector3D extends Vector {
	private double x, y, z;
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void resize(double factor) {
		this.x *= factor;
		this.y *= factor;
		this.z *= factor;
	}
}
