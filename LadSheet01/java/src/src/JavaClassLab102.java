import java.util.*;
public class JavaClassLab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Input the number of minutes: ");
	        int minutes = scanner.nextInt();

	        int minutesInYear = 60 * 24 * 365;
	        int years = minutes / minutesInYear;
	        int days = (minutes % minutesInYear) / (60 * 24);

	        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
	        scanner.close();
	    
		
	}

}
