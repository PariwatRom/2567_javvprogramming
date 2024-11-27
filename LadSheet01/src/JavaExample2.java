import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		//
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(strProductUnit);
		//แสดงผลและรับสินค้าทาง Dialog box 
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""+"Input Price per unit:"));
		
		double totalPriceofProduct = productUnit *productPrice;
		//คํานวณ7%
				double totalwithVat = totalPriceofProduct *1.07;
		//สั่งแสดงผล Dialog box 
		JOptionPane.showMessageDialog(null, 
											"Total Price is"+totalPriceofProduct+" baht."+
											"\nAdd VAT7% is "+totalwithVat+" baht.");
		
		
	}

}
