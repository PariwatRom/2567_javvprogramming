import javax.swing.*;

public class Lad206{
    public static void main(String[] args) {
        final int VANILLA = 10, CHOCOLATE = 15, TOPPING = 5;
        String flavorInput = JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\nPress number to choose flavor:");
        int flavor = Integer.parseInt(flavorInput);

        if (flavor != 1 && flavor != 2) {
            JOptionPane.showMessageDialog(null, "ERROR: Wrong choice! \nTry again...");
            return;
        }

        int price = (flavor == 1) ? VANILLA : CHOCOLATE;
        int addTopping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?");
        price += (addTopping == JOptionPane.YES_OPTION) ? TOPPING :0 ;

        String flavorName = (flavor == 1) ? "Vanilla" : "Chocolate";
        String toppingMsg = (addTopping == JOptionPane.YES_OPTION) ? "\nAnd topping" : "\nAnd no topping";

        JOptionPane.showMessageDialog(null, "You choose " + flavorName + " Flavor " + toppingMsg +
                "\nTotal price = " + price + " baht.");
    }
}