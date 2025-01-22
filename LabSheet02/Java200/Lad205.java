import javax.swing.*;
import java.util.*;

public class Lad205 {
    public static void main(String[] args) {
        Random rand = new Random();
        int balance = rand.nextInt(9) * 100000; // สุ่มยอดเงิน
        String input = JOptionPane.showInputDialog("Your balance: " + balance + "\nInput money to withdraw:");
        int withdraw = Integer.parseInt(input);

        if (withdraw > balance) {
            JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance");
        } else if (withdraw > 20000) {
            JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000 baht.");
        } else if (withdraw < 100 || withdraw % 100 != 0) {
            JOptionPane.showMessageDialog(null, "Error: Cannot withdraw " + (withdraw % 1000 % 500 %100 ) + " baht.");
        } else {
            JOptionPane.showMessageDialog(null, "You withdraw " + withdraw + " baht.\n1,000 = " + (withdraw / 1000) +
                    "\n500 = " + (withdraw % 1000 / 500) + "\n100 = " + (withdraw % 500 / 100));
        }
    }
}
