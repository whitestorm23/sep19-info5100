package question3;
import java.util.ArrayList;

import java.util.List;

public class Checkout {

	protected List<DessertItem> Items=new ArrayList<DessertItem>();
	public Checkout() {
	}
	public int numberOfItems() {
		return Items.size();
		
	}
	public void enterItem(DessertItem item) {
		Items.add(item);
		
	}
	
	public void clear() {
		Items.removeAll(Items);
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
		 StringBuilder sb = new StringBuilder();
		   sb.append("       M & M Dessert Shop       \n      --------------------      ");
		   for( DessertItem d : Items) {
				String item=d.getName();
				if ( d.getClass().getSimpleName().equals("Sundae")) {
					 String[] n= d.getName().split("\n", 0);
					sb.append(n[0]);
					sb.append("/n");
				
				}else if ( d.getClass().getSimpleName().equals("Candy")) {
					sb.append("2.25 lbs. @ 3.99 /lb.\n");
				}else if ( d.getClass().getSimpleName().equals("Cookie")) {
					sb.append("4 @ 3.99 /dz.\n");
				}
				String cost = DessertShop.cents2dollarsAndCents(d.getCost());
				item = setSpace(item, cost);
				sb.append(item);
			}
			return sb.toString();
	}
	private String setSpace(String item, String cost) {
		// TODO Auto-generated method stub
		return null;
	}    
}
