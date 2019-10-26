package question1;

public class User {
	private String name;	
	private int age;
	private String address;	
	private String phoneNumber;
	private String bankAccountNumber;
	private String password;
	private int availableBalance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public User(String name, int age, String address, String phoneNumber, String bankAccountNumber,String password) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.bankAccountNumber = bankAccountNumber;
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(int availableBalance) {
		this.availableBalance = availableBalance;
	}
	

}
