package M18_ProductManagement;

import java.util.Scanner;

public class PhysicalProduct extends Product {
    private String size;
    private double weight;
    private String color;
    

    public PhysicalProduct() {
        super(); // call parent's default constructor
        size = "N/A";
        weight = 0;
        color = "N/A";
    }

    public PhysicalProduct(String sku, String name, double price, String size, double weight, String color) {
        super(sku, name, price);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    // @Override is a reminder to the developer that this method
    // acutally exists in the parent class and we are overriding it
    public void displayDetails() {
        // call the parent's version of displayDetails
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }

    // @Override
    public void edit(Scanner sc) {
        super.edit(sc); // call parent version of edit


        System.out.println(("Enter the new weight or press ENTER to skip"));
        try {
            double weight = sc.nextDouble();
            this.setWeight(weight);
        } catch (Exception e) {

        } finally {
            sc.nextLine(); // finally is always called regardless
                          // if there's an exception
        }
       
        System.out.println("Enter the new size or press ENTER to skip");
        String size = sc.nextLine();
        setSize ( size.length() > 0 ? size : this.size);

        System.out.println("Enter the new color or press ENTER to skip");
        String color = sc.nextLine();
        setColor ( color.length() > 0 ? color : this.color);
    }

    @Override
    public double calculateSalesTax() {
        return getPriceWithGST();
    }

}
