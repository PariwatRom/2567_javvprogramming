import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectcode;
		boolean isStudentIDValid, isSubjectCodeValid;
		while(true) {
			// input student ID
			System.out.print("Emter student Id (10 digits): ");
			studentID = scanner.nextLine();
			
			//Input subject code 
			System.out.print("Enter subject code (7 digits) : ");
			subjectcode = scanner.nextLine();
			
			// Check lengths of student Id and subject code
			isStudentIDValid = isLength(studentID,10);
			isSubjectCodeValid = isLength(subjectcode,7);
			
			if (isStudentIDValid && isSubjectCodeValid){
				//Check student details
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectcode);
				
				//Display data
				displayData(studentID, subjectcode, isITStudent, isITSubject);
            	break; 
			}else {
				System.out.println("");
			} 
				
		}// end while()
	}//end of inputStudent () Method
	public static boolean isLength(String input,int len) {
		return input.length() ==len; 
	}
	public static boolean isITStudent(String studentID) {
	       boolean startYear = studentID.charAt(0) == '2' && studentID.charAt(1) == '1';
	       boolean level = studentID.charAt(3) == '1';
	       boolean corse = studentID.substring(3, 6).equals("311");
	       
	       return startYear && level && corse;
	   }
	   public static boolean isITSubject(String studentID) {
		   boolean major = studentID.startsWith("21");
	       boolean year = studentID.charAt(4) == 1;
	       return major && year;
	   }
	   public static void displayData(String studentID, String subjectcode, boolean isITStudent, boolean isITSubject) {
	      
		   if (isITStudent(studentID)&&isITSubject(studentID)) {
	           System.out.println("Student ID:  "+ studentID + " is a 1st year student in IT.");
	           System.out.println("Enroll in courses for Year 1");
	       } else if (!isITSubject(studentID)) {
	           System.out.println("Student ID: " + studentID + " is a 1st year student in IT.");
	           System.out.println("Not enroll in courses for Year 1");
	       }else {
	    	   System.out.println("Student ID: " + studentID + " is not a 1st year student in IT.");
	           System.out.println("Enroll in courses for Year 1");
	       }
	   }

}
