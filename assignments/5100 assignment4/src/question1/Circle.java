package question1;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() { 
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.println((radius*radius)*3.14); 
		
		
	}
	@Override
	public void getPerimeter() {
		System.out.println(2*radius*3.14);
	}
	
}
