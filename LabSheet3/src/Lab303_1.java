import javax.swing.JOptionPane;
public class Lab303_1 {

	public static void main(String[] args) {
		
		 String input1 = JOptionPane.showInputDialog("Input a sentence:");
	        String input2 = JOptionPane.showInputDialog("Input a sentence, again:");
	        
	        
	        int spaceCount = 0;
	        for (char ch : input2.toCharArray()) {
	            if (ch == ' ') {
	                spaceCount++;
	            }
	        }
	        int wordCount = spaceCount + 1;
	        
	        
	        JOptionPane.showMessageDialog(null, 
	            "This sentence has " + spaceCount + " spaces.\n" + 
	            "This sentence has " + wordCount + " words.",
	            "Message", JOptionPane.INFORMATION_MESSAGE);
	}

}
