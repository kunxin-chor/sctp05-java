package M18_ProductManagement;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    // the sc object is shared with all static methods
    // in Main. TLDR: static is only used in Main
    private static Scanner sc = new Scanner(System.in);

    // create an arraylist of products that is shared by all 
    // the static methods
    private static ArrayList<Product> catalog = new ArrayList<>();

    public static void main(String[] args) {
      
        while (true) {
            int choice = displayMenu();
            if (choice == 1) {
                displayProducts();
            }
            if (choice==2) {
                addProduct();
            }
            if (choice==3) {
                System.out.println("Update product");
            }
            if (choice==4) {
                System.out.println("Delete product");
            }
            if (choice==5) {
                break;
            }
        }
     
    }

    // static means: the method belongs to the class, 
    // and not the object (i.e shared with all the objects)
    private static int displayMenu() {
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1. Show all products");
        System.out.println("2. Add product");
        System.out.println("3. Update product");
        System.out.println("4. Delete product");
        System.out.println("5. Quit");
        int choice = sc.nextInt();
        sc.nextLine(); // clear the input buffer
        return choice;
    }

    private static void addProduct() {

        System.out.println("Entering product no: " + Product.getProductCount());
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        
        System.out.println("Enter the product price");
        double price = sc.nextDouble();
        sc.nextLine(); // clear the input buffer to get the rid \n that is left behind

        System.out.println("Enter the SKU");
        String sku = sc.nextLine();

        Product p = new Product(sku, productName, price);
        catalog.add(p);

    }

    private static void displayProducts() {
        for (Product p : catalog) {
            System.out.println(p.getName() + ", SKU=" + p.getSku() + ", price=" + p.getPrice());
        }
    }

}
