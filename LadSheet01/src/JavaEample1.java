import java.util.*;
import java.text.*;
public class JavaEample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กัาหนด object 
		Scanner input = new Scanner(System.in);
		//
		DecimalFormat frm = new DecimalFormat();
		//แสดงผลและรับข้อมูลชื่อสินค้า
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		//
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input product per unit: ");
		float productPrice = input.nextFloat();
		
		System.out.println(); // เว้น1บรรทัด
		//คํานวณหาผลรวม
		float totalPriceofProduct = productUnit *productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct) +" baht.");
		//คัานวณภาษีเพิ่ม7%
		float totalwithVat = totalPriceofProduct+(totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is  "+frm.format(totalwithVat)+" baht.");
		System.out.println(); // เว้น1บรรทัด
		//Output using String,Format and printf
		String FrmtotalwithVat = String.format("%,2f");
		System.out.println("Output using String,Format and printf");
		System.out.println("Add VAT 7%  "+FrmtotalwithVat+" baht.");
		System.out.println(); // เว้น1บรรทัด
		System.out.println("Output using printf");
		System.out.println("Add VAT 7%% is %,.2f "+totalwithVat);
		
		input.close();
		
	}

}
