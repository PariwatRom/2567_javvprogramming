import java.util.*;
public class Lab202 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int previous = Integer.MIN_VALUE;
	        int current;

	        while (true) {
	            System.out.print("Input number: ");
	            current = scanner.nextInt();
	            if (current < previous) {
	                break;
	            }
	            previous = current;
	        }

	        System.out.println("\nBYE BYE");
	        scanner.close();
	}

}
