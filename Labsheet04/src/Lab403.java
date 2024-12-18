import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String fullName ;//The input line entered by the user.
		String firstName;//The first name, extrcted from the input.
		
		System.out.println("Please enter your namr, separated by a space.");
		System.out.println(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' ');//หาช่อง(spacebar)
		firstName = fullName.substring(0,space); // ชื่อแรก
		//System.out.println(firsrName);

		//to get the middle name 
		System.out.println(abbreviatName(fullName)+fullName);
		input.close();
	}//end main () method
	
	public static String abbreviatName(String fName) {
		String initalLetter="";
		
		for (int i=0;i<fName.length();i++) {
			if (fName.charAt(i)==' ') {
				initalLetter = (initalLetter+fName.charAt(+1)).toUpperCase();
				initalLetter = initalLetter+".";
			}
		}//end for
		return initalLetter;
	}//end of abbreviatName ()

}
