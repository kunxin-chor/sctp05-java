package M18_ProductManagement;

import java.util.Scanner;

// There's no requirements technically for a class to be marked as abstract
// but if the class contains at least one abstract method, then
// it must be marked as abstract
public abstract class Product implements ITaxable {
    private String sku;
    private String name;
    private double price;

    // this variable methods to the CLASS, not the OBJECT
    // it is SHARED across all the objects of the same class
    private static int PRODUCT_COUNT = 0;
    public static int getProductCount() {
        return PRODUCT_COUNT;
    }

    public Product() {
        sku = "N/A";
        name = "";
    }

    public Product(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        PRODUCT_COUNT++;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        if (sku.length() > 0) {
            this.sku = sku;
        } else {
            throw new IllegalArgumentException("SKU must not be blank");
        }
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            // An exception is an object that represents an error
            throw new IllegalArgumentException("Invalid Name");
        }

     
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithGST() {
        return price + Utility.calculateGST(price);
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
      
    }

    // Whenever we use an object like
    // a String, the toString method
    // is called automatically
    @Override
    public String toString() {
        return "Product [sku=" + sku + ", name=" + name + ", price=" + price + "]";
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("SKU: " + sku);
        System.out.println("Price:" + price);

    }

    public void edit(Scanner sc) {
        System.out.println("Enter the new product name or press [ENTER] to remain unchanged");
        String productName = sc.nextLine();
        // if (productName.length() > 0) {
        //     setName(productName);
        // } 

        // <cond> ? <resut if true> : <result if false>)
        setName( productName.length() > 0 ? productName : this.name);

        System.out.println("Enter the new SKU - press ENTER to skip");
        String SKU = sc.nextLine();
        setSku( SKU.length() > 0 ? SKU : this.sku);

        System.out.println("Enter the new price - press ENTER to skip");
        String price = sc.nextLine();
        if (price.length() > 0) {
            setPrice(Double.parseDouble(price));
        }
    }

    public abstract double calculateSalesTax(); // no idea on how to calculate sale tax for an abstract producr

    @Override
    public double getSalesTax() {
        return calculateSalesTax();
    }
}
