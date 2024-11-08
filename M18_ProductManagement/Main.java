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
            if (choice == 2) {
                addProduct();
            }
            if (choice == 3) {
                updateProduct();
            }
            if (choice == 4) {
                System.out.println("Delete product");
            }
            if (choice == 5) {
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

        System.out.println("Enter the type of product to create: (p) for physical proudct or (d) for digital product");
        String productType = sc.nextLine().toLowerCase();
        if (productType.equals("p") || productType.equals("d")) {
            System.out.println("Enter product name: ");
            String productName = sc.nextLine();

            System.out.println("Enter the product price");
            double price = sc.nextDouble();
            sc.nextLine(); // clear the input buffer to get the rid \n that is left behind

            System.out.println("Enter the SKU");
            String sku = sc.nextLine();

            Product p; // product to be created

            if (productType.equals("p")) {
                System.out.println("Enter the product dimension (wxh)");
                String size = sc.nextLine();

                System.out.println("Please enter the weight");
                double weight = sc.nextDouble();
                sc.nextLine();

                System.out.println("Please enter the color");
                String color = sc.nextLine();

                p = new PhysicalProduct(sku, productName, price, size, weight, color);

            } else {
                System.out.println("Enter the file format");
                String fileFormat = sc.nextLine();

                System.out.println("Enter the download link:");
                String downloadLink = sc.nextLine();

                System.out.println("Enter the file size in bytes");
                int fileSize = sc.nextInt();
                sc.nextLine();

                p = new DigitalProduct(sku, productName, price, fileFormat, downloadLink, fileSize);
            }

            catalog.add(p);

        } else {
            System.out.println("Sorry, please select (p) or (d)");
            return;
        }

    

    }

    private static void displayProducts() {
        System.out.println();
        System.out.println("All products");
        for (int i = 0; i < catalog.size(); i++) {
            
            var p = catalog.get(i);
            // polymorphism happens here
            // if p is a physical product, call PhysicalProduct.displayDetails()
            // if p is a digital product, call DigitalProduct.displayDetails
            System.out.println("Product index: " + i);
            p.displayDetails();
    
        }
    }

    private static void updateProduct() {
        System.out.println();
        System.out.println("Choose a product to edit");
        displayProducts();
        int productIndex = sc.nextInt();
        sc.nextLine();

        // store the product that we want to edit into `p`
        Product p = catalog.get(productIndex);
        p.edit(sc);
    
    }

}
