import java.util.Scanner;

public class Lad209 {
    public static void main(String[] args) {
        final double COMMISSION_RATE = 0.15; 
        final int BASE_SALARY = 1000;       
        final int SENTINEL = -1;            
        
        Scanner scanner = new Scanner(System.in);
        int sales;                          
        double salary;                     
        
        while (true) {
            System.out.print("Enter sales in dollars (or -1 to end): ");
            sales = scanner.nextInt();
            
            if (sales == SENTINEL) {
                System.out.println("bye");
                break;
            }
            
            salary = BASE_SALARY + (sales * COMMISSION_RATE);
            System.out.printf("Salary is: $%.2f%n", salary);
        }
        
        scanner.close();
    }
}