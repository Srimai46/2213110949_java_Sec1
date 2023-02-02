
public class Point3D extends Point2D{
	private float z;
	
	public Point3D(float x, float y,float z) {
			super();
			this.z = z;
		}
	public Point3D() {
		super();
		this.z=0;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z=z;
	}
	public void setXYZ(float x, float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z=z;
	}
	public float[] getXYZ() {
		float[] re = new float[3];
		re[0] = super.getX();
		re[1] = super.getY();
		re[2] = this.z;
		return re;
	}
	@Override
	public String toString() {
		return super.toString()+",and"+getZ()+")";
	}

}
