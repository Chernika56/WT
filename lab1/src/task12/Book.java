package task12;

/**
 * A book with title, author, price and edition
 */
public class Book {

    private String title;

    private String author;

    private int price;

    private static int edition;

    /**
     * Creates new book with given title, author and price
     *
     * @param title  name
     * @param author writer
     * @param price  cost of the book
     */
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + price;
    }

    @Override
    public int hashCode() {
        return price * title.hashCode() + author.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) {
            return false;
        }
        if (o.hashCode() != hashCode()) {
            return false;
        }

        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

}
