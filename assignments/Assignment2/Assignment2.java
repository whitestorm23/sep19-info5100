package Assignment2;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public double salaryGreaterThanFiveThousand(Employee[] employees) {
    	double sum=0;
    	for(Employee member:employees) {
    		if(member.getSalary()>5000) {
    			sum=sum+member.getSalary();
    		}else {
    			continue;
    		}
    		
    	}
    	
        // @TODO
        return sum;
    }

    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
    	{
    		int ID=employee.getId();
    		if(ID%3==0){
    			System.out.println("Fizz");	
    		}else if(ID%5==0){
    			System.out.println("Buzz");
    		}else if(ID%3==0&&ID%5==0) {
    			System.out.println("FizzBuzz");
    		}
    	}
        // @TODO

	}

    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public double calculateTax(Employee employee) {
    	double salary=employee.getSalary();
    	double tax=0;
    	if(salary<=2500) {
    		tax=salary/10;
    	}else if(salary>2500&&salary<=5000) {
    		tax=salary*0.25;
    	}else if(salary>5000) {
    		tax=salary*0.35;
    	}
		// @TODO
        return tax;
    }

    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
    	 double salaryFirst=firstEmployee.getSalary();
    	 double salarySecond=secondEmployee.getSalary();
    	 secondEmployee.setSalary(salaryFirst);
    	 firstEmployee.setSalary(salarySecond);
    	 
        // @TODO
    }

    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
    	int num=0;
    	for(Employee member:employees) {
    		int age=member.getAge();
    		if(age>=50) {
    			num++;
    		}else {
    			continue;
    		}
    	}
        // @TODO
        return num;
    }

    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        for(int i=0;i<=employeesStr.length;i++) {
        	int id=Integer.parseInt(employeesStr[i].substring(0));
        	employees[i].setId(id);
        	employees[i].setFirstName(employeesStr[i].substring(2,5));
        	int age=Integer.parseInt(employeesStr[i].substring(7,8));
        	employees[i].setAge(age);
        	double salary=Double.parseDouble(employeesStr[i].substring(10,employeesStr[i].length()));
        	employees[i].setSalary(salary);
        }
        // @TODO
        return employees;
    }

    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
    	String name=employee.getFirstName();
    	String reverse = new StringBuffer(name).reverse().toString();
    	System.out.println(reverse);
        // @TODO
    }

    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public void isContainDigit(Employee employee) {
    	String name=employee.getFirstName();
    	for (int i=0;i<= name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                System.out.println("true");

        // @TODO
    }else {
    	System.out.println("false");
    }
   }

}
}
