import java.util.Scanner;

public class TestProduvt {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
        
        Product product = new Product();

        System.out.print("Enter product name: ");
        String name = scan.nextLine();

        System.out.print("Enter product price: ");
        double price = scan.nextDouble();

        System.out.print("Enter VAT rate (%): ");
        double vatRate = scan.nextDouble();

        product.setProductDetails(name, price, vatRate);
        product.displayProductDetails();

        scan.close();
    }
}