import java.util.Scanner;

public class Lad207 {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        int taxableIncome = scanner.nextInt();

        double taxPayable = 0.0;

        if (taxableIncome > 60000) {
            taxPayable += (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
            taxableIncome = 60000;
        }
        if (taxableIncome > 40000) {
            taxPayable += (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
            taxableIncome = 40000;
        }
        if (taxableIncome > 20000) {
            taxPayable += (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        }

        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
    }
}