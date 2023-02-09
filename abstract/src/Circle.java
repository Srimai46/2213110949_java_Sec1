
public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius ,String color) {
		super(color);
		this.radius = radius;
	}
	public double getRadius () {
		return radius;
			
		
	}
	public String toString () {
		return "radius="+radius;
	}
	@Override
	public double getArea () {
		return Math.PI*getRadius()*getRadius();
	}


}
