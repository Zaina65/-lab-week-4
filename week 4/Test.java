
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop(new Person("Amjad Shah", "amjads@gmai.com"), "Talwar Chowk, Bahria Town, Lahore");
        Shop shop1 = new Shop("Smash");

        System.out.println("***********************************");
        System.out.println("        Welcome to " + shop1.getShopName() + " Restaurant");
        System.out.println("***********************************");

        shop.OwnerDetails();
        shop.Address();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n=======================================");
            System.out.println("               Main Menu               ");
            System.out.println("=======================================");
            System.out.println("1. Add Product");
            System.out.println("2. Sale Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Display Product");
            System.out.println("5. Modify Product");
            System.out.println("6. Search Product");
            System.out.println("7. View Revenue");
            System.out.println("0. Exit");
            System.out.println("=======================================\n");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.println("---------------------------------------");
            
            switch (choice) {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.sale();
                    break;
                case 3:
                    shop.removeProduct();
                    break;
                case 4:
                    shop.displayProducts();
                    break;
                case 5:
                    shop.modifyProduct();
                    break;
                case 6:
                    shop.searchProduct();
                    break;
                case 7:
                    shop.showRevenue();
                    break;
                case 0:
                    System.out.println("Thank you for using the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}