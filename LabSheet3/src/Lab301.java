import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		//กําหนดตัวแปรชื่อ text ไว้รวมข้อความเข้ากัน
		 String txtConcate = "";
		 //กําหนดตัวแปร  word ไว้ศัาหรับรับข้อความทาง Console
		 String word;
		 
		 while(true) {
			 System.out.print("Enter word: ");
			 word = kb.next();
			 
			 if (word.equalsIgnoreCase("stop")) {
				 System.out.print("Program Terminate");
				 break;
			 }
			 txtConcate += word+" ";
			 
		 }
		 System.out.println(txtConcate.toUpperCase());
		
		kb.close();
	}

}
