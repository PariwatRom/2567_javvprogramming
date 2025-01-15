
public class Employee {

	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	//method to set employee etails
	public void setEmployeeDetails(String empName,int hours,double rate) {
	name =  empName;
	hourWorked = hours;
	hourlyRate = rate;
}
	
	//Mathod to calculat Salary
	public double calculatSalary() {
		double salary = hourWorked * hourlyRate;
		if (hourWorked > 40) {
			double bonus = salary * 0.10; //Bonus is 10% of salary
			salary += bonus;
		}
		return salary;
	}
	//Mathod to display employee details
	public void displayEmployeeDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Hours Worked: "+ hourWorked);
		System.out.println("Hourly Rate : "+hourlyRate);
		System.out.println("Total Salary: "+calculatSalary());
		
	}
}//end of Class