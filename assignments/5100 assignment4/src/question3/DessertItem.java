package question3;

public abstract class DessertItem {
	protected String name;
	public DessertItem() {
	}
	public DessertItem(String name) {
		this.name=name;
	}
	public final String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract int getCost();


	

}