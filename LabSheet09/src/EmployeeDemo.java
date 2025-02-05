import java.util.*;
public class EmployeeDemo {
	public static void main (String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Input employee id :");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("Input employee Name :");
		String empName = scan.nextLine();
		System.out.print("Input employee salare :");
		Double empsalary = scan.nextDouble();
		System.out.print("Input employee salare :");
		Double empsales = scan.nextDouble();
		
		System.out.println();
		Sales emp1 = new Sales(empId,empName,empsalary,empsales);
		System.out.println(emp1);
		
		System.out.printf("Total salary %.2f" + (emp1.getSalary()+emp1.getCommission())+" baht.");
	}
}
