package question3;

public class FullTime extends Employee {

	public FullTime(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}
	public int caculateSalary(){
		int salary=this.getPaymentPerHour()*8;
		return salary;
	}
}
