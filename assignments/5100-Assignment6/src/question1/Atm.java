package question1;

import java.util.HashMap;
import java.util.Map;

public class Atm {
	private int availableAmountInMachine;
	private int transactionFee;
	boolean LoginState=false;
	
	public int getAvailableAmountInMachine() {
		return availableAmountInMachine;
	}

	public void setAvailableAmountInMachine(int availableAmountInMachine) {
		this.availableAmountInMachine = availableAmountInMachine;
	}

	public int getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(int transactionFee) {
		this.transactionFee = transactionFee;
	}

	Map<String,User> userData=new HashMap<String,User>(); 
	
	public Atm(int availableAmountInMachine, int transactionFee, Map<String, User> userData) {
		super();
		this.availableAmountInMachine = availableAmountInMachine;
		this.transactionFee = transactionFee;
		this.userData = userData;
	}
	public void login(String AccoundNumber,String password) {
		if(userData.containsKey(AccoundNumber)==false) {
			throw new RuntimeException("Cannot find your account");
		}
		else if(userData.containsKey(AccoundNumber)==true&&userData.get(AccoundNumber).getPassword()!=password) {
			throw new RuntimeException("type in wrong password");
		}
		else if(userData.containsKey(AccoundNumber)==true&&userData.get(AccoundNumber).getPassword()==password) {
			this.LoginState=true;
			System.out.println("you're succeed to login");
		}
		
		
	}
	public void Reset(String name,int age, int phoneNumber) {
		
	}

	public static void main(String[] args) {
		User Ma=new User("Ma", 23, "Bejing", "13641168506", "6666666","143857");
		Atm atm1=new Atm(0, 0, null);
		atm1.userData.put("666666", Ma);
	}
}
