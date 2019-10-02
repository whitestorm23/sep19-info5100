package question3;

public class Sundae extends IceCream {

	private int num;
	private int coneCost;

	public Sundae(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Sundae(String name, int num, String conesName, int coneCost) {
		this.name=name;
		this.num=num;
		this.coneCost=coneCost;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return num+coneCost;
	}

}
