import java.util.*;
public class SucurePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit to quit')");
			String password = scan.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			String error="";
			if(password.length()<8) {
				error += "-Password must be at least 8 characters long.\n";
			}
			boolean hasUpperCaseb = false;
			boolean hasLowerCaseb = false;
			boolean hasdigit = false;
			
				for (int i=0;i<password.length();i++) {
					char ch = password.charAt(i);
					if(ch >= 'A' && ch<'Z') {
						hasUpperCaseb = true;
					}else if (ch >= 'a' && ch<'z') {
						hasLowerCaseb = true;
					}else if ((ch >= '0' && ch<'9')) {
						hasdigit = true;
					}
					
			}
				if (!hasUpperCaseb) {
					error += "-Password must contain at lease one uppercase letter (A-Z).\n";
				}
				if (!hasLowerCaseb) {
					error += "-Password must contain at lease one uppercase letter (a-z).\n";
				}
				if (!hasdigit) {
					error += "-Password must contain at lease one  (0-9).\n";
				}
				
				if(error.isEmpty()) {
					System.out.println("You password is secure.");
					break;
				}
				else {
					System.out.println("Password validetion error");
					System.out.println(error);
				}
				
				scan.close();

			}
		

}
}
