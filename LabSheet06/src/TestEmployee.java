
public class TestEmployee {

	public static void main(String[] args) {
		// 
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//Display employee 
		System.out.println("Employ 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmploy 2 Details");
		emp2.displayEmployeeDetails();
	}
}//end of Class
