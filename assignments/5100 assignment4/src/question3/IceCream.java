package question3;

public class IceCream extends DessertItem {

	private int cost;

	public IceCream(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public IceCream(String name, int cost) {
		super.name=name;
		this.cost=cost;
		// TODO Auto-generated constructor stub
	}
	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
