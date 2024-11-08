package M17_Library_Interface;

public class LendingMaterial {
    protected String title;
    protected int yearPublished;
    protected double cost;
    protected boolean isReference;

    public LendingMaterial() {
        title = "N/A";
        yearPublished = -1; // -1 means no published date
        cost = 0;
        isReference = false; 
    }


    public LendingMaterial(String title, int yearPublished,
                     double cost, 
                     boolean isReference) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.cost = cost;
        this.isReference = isReference;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isReference() {
        return isReference;
    }

    public void setReference(boolean isReference) {
        this.isReference = isReference;
    }


}
