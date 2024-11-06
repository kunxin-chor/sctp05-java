package M12_LibraryInheritance;

public class LendingMaterial {
    protected String title;
    protected int yearPublished;
    protected double cost;
    private String isbn;
    protected boolean isReference;

    public LendingMaterial() {
        title = "N/A";
        yearPublished = -1; // -1 means no published date
        cost = 0;
        isbn = "N/A";
        isReference = false; 
    }


    public LendingMaterial(String title, int yearPublished,
                     double cost, String isbn, 
                     boolean isReference) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.cost = cost;
        setIsbn(isbn);
        this.isReference = isReference;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (yearPublished < 2007 && isbn.length() != 10) {
            return;
        }  
        if (yearPublished >= 2007 && isbn.length() != 13) {
            return;
        }
        this.isbn = isbn;
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
