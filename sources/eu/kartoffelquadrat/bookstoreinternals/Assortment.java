package eu.kartoffelquadrat.bookstoreinternals;

import java.util.Collection;

/**
 * Represents the catalogue of all indexed books.
 *
 * @author Maximilian Schiedermeier
 */
public interface Assortment {

  /**
   * Retrieves all books that are indexed, no matter if they are in stock somewhere or not.
   *
   * @return the list off registered isbns.
   */
  Collection<Long> getEntireAssortment();

  /**
   * Retrieved book details for a specific book, identified by isbn.
   *
   * @param isbn for the identifier of the book in question.
   * @return A BookDetail object, containing the static metadata of the requested book.
   */
  BookDetailsImpl getBookDetails(Long isbn);

  /**
   * Indexes a new book. The isbn of the bookDetails parameter bean must not conflict with an
   * existing book.
   *
   * @param bookDetails for the exact data of the book to be added to the assortment.
   */
  void addBookToAssortment(BookDetailsImpl bookDetails);
}
