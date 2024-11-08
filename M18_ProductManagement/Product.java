package M18_ProductManagement;

public class Product  {
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

    

    
}
