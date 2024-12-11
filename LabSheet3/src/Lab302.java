import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
	
		
		
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again: ");
		
		}
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com")) {
			inputEmail = JOptionPane.showInputDialog(null,"Your e-mail is:"+inputEmail);
		}else {
			inputEmail = JOptionPane.showInputDialog(null,"Your e-mail is not hotmail or gmail dotr ");
		}

	}

}
