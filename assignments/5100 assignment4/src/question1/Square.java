package question1;

public class Square extends Shape {
	private double side;
	
	public Square(double d) {
		this.setSide(d);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double d) {
		this.side = d;
	}

	@Override
	public void getArea() {
		System.out.println(side*side); 
		
	}
	@Override
	public void getPerimeter() {
		System.out.println(4*side);
	}
}
