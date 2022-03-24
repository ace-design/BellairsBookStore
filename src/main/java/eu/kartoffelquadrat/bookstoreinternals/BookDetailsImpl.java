package eu.kartoffelquadrat.bookstoreinternals;

/**
 * Bean representing a single book with public read access to all fields. Immutable, once created none of the fields can
 * be changed any more.
 *
 * @author Maximilian Schiedermeier
 */
public class BookDetailsImpl {

    private long isbn;
    private String title;
    private String author;
    private int priceInCents;
    private String bookAbstract;

    /**
     * Default constructor. Only required to support json deserialization without reflective voodoo like e.g.
     * objenesis.
     */
    public BookDetailsImpl() {
    }

    /**
     * Fully parameterized constructor. Use this one instead of the default constructor to populate a book object upon
     * creation.
     *
     * @param isbn         as the isbn of the book.
     * @param title        as the title of the book.
     * @param author       as the author of the book.
     * @param priceInCents as the price in canadian cents of the book.
     * @param bookAbstract as the abstract of the book.
     */
    public BookDetailsImpl(long isbn, String title, String author, int priceInCents, String bookAbstract) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.priceInCents = priceInCents;
        this.bookAbstract = bookAbstract;
    }

    /**
     * Getter for isbn number of book.
     *
     * @return the isbn number as a long.
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * Getter for the book's title.
     *
     * @return the books title as a String.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for the author of the book.
     *
     * @return the authors name as String.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Getter for the book's price in canadian cents.
     *
     * @return the book price in canadian cents.
     */
    public int getPriceInCents() {
        return priceInCents;
    }

    /**
     * Getter for the book's abstract desription.
     *
     * @return the book's abstract as string.
     */
    public String getBookAbstract() {
        return bookAbstract;
    }

    /**
     * Converts the book detail fields to a human readable String.
     *
     * @return all fields formatted human readable string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("ISBN: ").append(isbn).append("\n");
        sb.append(" > Title: ").append(title).append("\n");
        sb.append(" > Author: ").append(author).append("\n");
        sb.append(" > Price: ").append(priceInCents / 100).append(",").append(priceInCents % 100).append(" CAD\n");
        sb.append(" > Abstract: ").append(bookAbstract).append("\n");
        return sb.toString();
    }
}
