package question1;

public class Rectangle extends Shape {
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	private double weight;
	private double height;
	
	public Rectangle(double weight, double height) {
		this.weight=weight;
		this.height=height;
	}
	@Override
	public void getArea() {
		System.out.println(height*weight); 
		
	}
	@Override
	public void getPerimeter() {
		System.out.println(2*(weight+height));
	}
}
