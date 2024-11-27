import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input Product Name     : ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit     : ");
		int productUnit = input.nextInt();
		System.out.print("Input Product per unit : ");
		float productPrice = input.nextFloat();
		
		System.out.println("------------------------------------------");
		float totalPriceofProduct = productUnit *productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct) +" baht.");
		System.out.println("------------------------------------------");
		
		System.out.print("How many discoount (%)   : ");
		int discount = input.nextInt();
		System.out.println("------------------------------------------");
		float totaldiscount = ((totalPriceofProduct*discount/100));
		System.out.println("Discoount from 15%      "+totaldiscount+" baht.");
		
		float amount = totalPriceofProduct-totaldiscount;
		System.out.println("How many discoount (%)  "+frm.format(amount)+"baht.");
		
	}

}
