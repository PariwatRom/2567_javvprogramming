import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence ;
       
            System.out.print("Input some sentence: ");
             sentence = scanner.nextLine();
            
             while (true) {
            if (sentence.endsWith(".")) {
            	System.out.println(" ");
             			for (String word : sentence.split(" ")) {
             				System.out.println(word);
             				}
                break;
            } else {
                System.out.print("The sentence must end with full stop point: ");
                sentence = scanner.nextLine();
            }
        }
        scanner.close();
    }
}