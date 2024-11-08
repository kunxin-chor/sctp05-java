package M17_Library_Interface; 
public class Book extends LendingMaterial implements HasISBN {
   
    private String author;
    private String isbn;

    public Book() {
        super();
    }

    public Book(String title, int yearPublished, double cost, boolean isReference, String author) {
        super(title, yearPublished, cost, isReference);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getISBN() {
        return isbn;
    }

    @Override
    public void setISBN(String isbn) {
       this.isbn =isbn;
    }
}
