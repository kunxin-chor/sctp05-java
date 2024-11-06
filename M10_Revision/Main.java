package M10_Revision;

public class Main {
    public static void main(String[] args) {
        Book b;
        b = new Book();
        System.out.println(b.getTitle() + " ISBN =" + b.getIsbn());
    
        Book b2 = new Book("Lord of the Rings",
            1970, 20.30, "0123456789", false);

        Book b3 = new Book("Twilight", 1990, "0123456789");
    }
}
