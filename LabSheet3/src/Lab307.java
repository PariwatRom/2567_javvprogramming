import java.util.*;

public class Lab307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        String cleanedText = text.replaceAll("\\s", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();

        if (cleanedText.equals(reversedText)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}