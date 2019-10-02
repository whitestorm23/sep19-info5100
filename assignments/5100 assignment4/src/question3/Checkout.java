package question3;

import java.util.List;

public class Checkout {
	  List<DessertItem> Items;
	public Checkout() {
		
	}
	public int numberOfItems() {
		return Items.size();
		
	}
	public void enterItem(DessertItem item) {
		Items.add(Items.size(),item);
		
	}
	
	public void clear() {
		Items=null;
	}
	public int totalCost() {
		// TODO Auto-generated method stub
		int totalCost=0;
		for(DessertItem i:Items) {
			totalCost=totalCost+i.getCost();
		}
		
		return totalCost ;
	}
	public int totalTax() {
		// TODO Auto-generated method stub
		return (int) (this.totalCost()*0.65);
	}
	@Override
	public java.lang.String toString(){
		return null;
		
	}
	
}
