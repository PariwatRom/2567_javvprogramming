import java.util.Scanner;

public class Lab304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        if (fullName.contains(" ")) {
            int spaceIndex = fullName.indexOf(" ");
            String firstName = fullName.substring(0, spaceIndex).toUpperCase();
            String lastName = fullName.substring(spaceIndex + 1).toLowerCase();
            
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Incorrect Name");
        }
    }
}