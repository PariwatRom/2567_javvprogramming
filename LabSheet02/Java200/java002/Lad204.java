import java.util.Scanner;

public class Lad204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input value of X: ");
        int x = scanner.nextInt();
        int y;

        // รับค่า Y ที่ต้องมากกว่า X
        do {
            System.out.print("Input value of Y: ");
            y = scanner.nextInt();
            
            if (y <= x) {
                System.out.print("Input value of Y, again: ");
                y = scanner.nextInt();
            }
        } while (y <= x);

        // แสดงผลรวมสะสม
        int sum = x;
        System.out.println("");
        for (int i = x + 1; i <= y; i++) {
            System.out.println(sum + " + " + i + " = " + (sum + i));
            sum += i; 
        }

        scanner.close();
    }
}