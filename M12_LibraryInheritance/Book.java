package M12_LibraryInheritance; 
public class Book extends LendingMaterial {
   
    private String author;

    public Book() {
        super();
    }

    public Book(String title, int yearPublished, double cost, String isbn, boolean isReference, String author) {
        super(title, yearPublished, cost, isbn, isReference);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
