package M18_ProductManagement;

public class Membership implements ITaxable {
    private String type;
    private double cost;

    public Membership() {
        type = "N/A";
    }

    public Membership(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public double getSalesTax() {
       return cost * 0.1;
    }

    
}
