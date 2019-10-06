package question3;

public class Cookie extends DessertItem {

	private int costPerLb;
	private int num;

	public Cookie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Cookie(String string, int i, int j) {
		this.num=i;
		this.costPerLb=j;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return num*costPerLb/12;
	}

	public int getNumber() {
		// TODO Auto-generated method stub
		return num;
	}

	public int getPricePerDozen() {
		// TODO Auto-generated method stub
		return costPerLb;
	}

}
