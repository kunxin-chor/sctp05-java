package M17_Library_Interface;

public class AudiobookCD extends CD implements HasISBN {
    private String author;
    private String isbn;

    public AudiobookCD(String author) {
        this.author = author;
    }

    public AudiobookCD(String title, int yearPublished, double cost, boolean isReference, String mediaType,
            String dataType, String author) {
        super(title, yearPublished, cost, isReference, mediaType, dataType);
        this.author = author;
    }

    public String getISBN() {
        return isbn;
    }
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }
     
}
