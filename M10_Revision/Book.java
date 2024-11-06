package M10_Revision; // <= packages are containers for classes

                      // it's a way to organise classes
                      // it's optional if you don't use folders

// means other packages (i.e classes not in the same folder)
// to access. IMPT: One file can only have one public class
public class Book {

    // Why do we set member variables to private:
    // 1. encapsulation: the business logic of the class
    //                   should be all within the class itself
    // 2. data hiding: certain aspects (i.e attributes) of the class
    //                 must be hidden from other classes that encapsulation
    //                 can be respected. It is to ensure consistency

    private String title; // private: only the class an access
    private int yearPublished;
    private double cost; // decimal values, usually use double
    private String isbn;
    private boolean isReference; // is the book reference or not?

    // constructor allows us to fill in the default
    // values of a new object in one line

    // default constructor
    // - recieves no parameters
    // - purpose: is the set default vaules of the class' member variables
    public Book() {
       title = "N/A";
       yearPublished = -1; // -1 means no published date
       cost = 0;
       isbn = "N/A";
       isReference = false; 
    }

    // overloaded constructor
    // - has parameters
    // - purpose: assign the value of the parameters as the initial
    // values of the object
    public Book(String title, int yearPublished, double cost, String isbn, boolean isReference) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.cost = cost;
        setIsbn(isbn); // we use the setter to make sure the business rule for ISBN is enfoced
        this.isReference = isReference;
    }

    // We can have multiple overloaded constructors
    public Book(String title, int yearPublished, String isbn) {
        this.title = title;
        this.yearPublished = yearPublished;
        setIsbn(isbn);
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

    public boolean isReference() {
        return isReference;
    }

    public void setReference(boolean isReference) {
        this.isReference = isReference;
    }

}
