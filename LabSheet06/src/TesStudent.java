
public class TesStudent {

	public static void main(String[] args) {
		//
		Student student1 = new Student();
		Student student2 = new Student();
		
		//
		student1.setStudentDayeils("Siriyakorn",new double[] {58.5,78.0,92.0});
		student2.setStudentDayeils("Sumsoo",new double[] {68.0,66.5});
		
		//
		System.out.println("Student 1 details:");
		student1.displayStudentDetails();
		System.out.println("\nStudent 2 details:");
		student2.displayStudentDetails();
	}

}
