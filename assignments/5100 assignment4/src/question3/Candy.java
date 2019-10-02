package question3;

public class Candy extends DessertItem {
	private double num;
	private int costPerLb;	

	public Candy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Candy(String string, double d, int i) {
		this.num=d;
		this.costPerLb=i;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return (int) (num*costPerLb);
	}

}
