package question3;

public abstract class Employee {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	private int paymentPerHour;
	public Employee(String name, int paymentPerHour) {
		this.name=name;
		this.paymentPerHour=paymentPerHour;
		
	}
}
