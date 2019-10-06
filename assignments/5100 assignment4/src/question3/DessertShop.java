package question3;


public class DessertShop {
	
	    private double taxRate = 0.065;

	    public static String cents2dollarsAndCents(Integer cent){
	        return Double.toString((double)cent/100);
	    }

	    public double getTaxRate() {
	        return taxRate;
	   }
	
}