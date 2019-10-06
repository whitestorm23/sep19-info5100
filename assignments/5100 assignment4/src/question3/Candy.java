package question3;

public class Candy extends DessertItem {
	private double num;
	private int costPerLb;	

	public Candy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Candy(String string, double d, int i) {
		super.name=string;
		this.num=d;
		this.costPerLb=i;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return (int) (num*costPerLb);
	}

	public double getWeight() {
		// TODO Auto-generated method stub
		return num;
	}

	public int getPricePerPound() {
		// TODO Auto-generated method stub
		return costPerLb;
	}

}
