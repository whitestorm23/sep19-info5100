package question1;

public class Shape {
	private String name;
	private double perimeter;
	private double area;
	
	public String getClassName() {
		return getClass().getSimpleName();
	}

	public void getPerimeter() {
		System.out.println(perimeter);
	}



	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}



	public void getArea() {
		System.out.println(area);;
	}



	public void setArea(double area) {
		this.area = area;
	}

	

	
	public void draw() {
		System.out.println("Drawing "+getClassName());
		
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}

	
}


