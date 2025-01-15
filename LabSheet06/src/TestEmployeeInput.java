import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//
		System.out.println("Enter details for Employee 1 :");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHouWorked1 = scan.nextInt();
		System.out.print("Hours Rate: ");
		double empHourlyRate1 =scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHouWorked1, empHourlyRate1);
		Line('-');
		emp1.displayEmployeeDetails();
		Line('*');

		scan.nextLine();		
		//
		System.out.println("Enter details for Employee 2 :");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHouWorked2 = scan.nextInt();
		System.out.print("Hours Rate: ");
		double empHourlyRate2 =scan.nextDouble();
		
		emp2.setEmployeeDetails(empName1, empHouWorked1, empHourlyRate1);
		Line('-');
		emp2.displayEmployeeDetails();
		Line('*');
		
		scan.close();
	}//end of main
	// Line method
	public static void Line(char symbol) {
		//System.out.println("");
		for (int i=1;i<50;i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}

}
