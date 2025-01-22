import javax.swing.JOptionPane;
public class ClassLab105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  final double TAX_RATE = 0.0625;
		  
	        String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order");
	        String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD:");
	        double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars:"));
	        int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased:"));

	        double cdSubtotal = cdPrice * cdQuantity;
	        double cdTotal = cdSubtotal * (1 + TAX_RATE);

	        String output = String.format(
	            "Summary of the transaction:\n\n CD ID: %s\nCD Title: %s\nCD Unit Price: $%.1f\nCD Quantity: %d\n\nSubtotal: $%.1f\nTax rate: %.1f%%\nTotal: $%.1f\n\nEnd of Program",
	            cdId, cdTitle, cdPrice, cdQuantity, cdSubtotal, TAX_RATE * 100, cdTotal
	        );
	        JOptionPane.showMessageDialog(null, output);
	}

}
