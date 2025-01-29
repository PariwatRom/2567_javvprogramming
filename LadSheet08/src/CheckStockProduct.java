import java.util.*;

class CheckStockProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many product list in stock : ");
        int numProducts = scanner.nextInt();

        Product[] productList = new Product[numProducts];

        for (int i = 0; i < productList.length; i++) {
            productList[i] = new Product();

            System.out.print("Input product Id : ");
            productList[i].setId(scanner.next());

            System.out.print("Input product Unit : ");
            productList[i].setUnit(scanner.nextInt());
            System.out.println();
        }

        System.out.println("\n---------------------------------");

        System.out.println("List of product in 'LOW' status.");
        for (Product p : productList) {
            if (p.getUnit() < 5) {
                System.out.println(">> " + p.getId() + " has " + p.getUnit() + " units");
            }
        }
        System.out.println("---------------------------------");
        
        System.out.println("List of product in 'NORMAL' status.");
        for (Product p : productList) {
            if (p.getUnit() >= 5 && p.getUnit() < 50) {
                System.out.println(">> " + p.getId() + " has " + p.getUnit() + " units");
            }
        }
        System.out.println("---------------------------------");

        System.out.println("List of product in 'HIGH' status.");
        for (Product p : productList) {
            if (p.getUnit() >= 50) {
                System.out.println(">> " + p.getId() + " has " + p.getUnit() + " units");
            }
        }

        scanner.close();
        
    }
}