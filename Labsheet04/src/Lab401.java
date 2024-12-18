import javax.swing.*;
public class Lab401 {
	
	// main () method
	public static void main(String[] args) {
		inputEmail();

	}//end if main Method
	public static void inputEmail() {
		String ans;
		String vaeEmail;
		do {
			vaeEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if (vaeEmail != null && !vaeEmail.isEmpty()) {
				checkEmailErorr(vaeEmail);
				
			}else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y]");
		}while(ans != null && ans.equalsIgnoreCase("y"));
	}//end of inputEmail () method
	
	//checkEmailErorr () Method
	public static void checkEmailErorr(String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again:");
			
		}
		email = email.toLowerCase();
		JOptionPane.showInternalMessageDialog(null,
				checkEmail(email)
				?"You e-mail is "+email //return true
				:"You e-mail is not hotmail or gmail address."//return false
			);
	}//end of checkEmailErorr() method

	public static boolean checkEmail(String email) {
		
		return email.endsWith("@gmail.com")||email.endsWith("@hotmail.com");
			
		}
	}

