package eu.kartoffelquadrat.bookstoreinternals;

import java.util.Map;

/**
 * Offers access to all Comments of all Books.
 *
 * @author Maximilian Schiedermeier
 */
public interface Comments {

  /**
   * Returns all comments stored for a specific book.
   *
   * @param isbn as the identifier of the book in question
   * @return a map of commentIds to comments.
   */
  Map<Long, String> getAllCommentsForBook(long isbn);

  /**
   * Add a comment to an existing book. Comments for non-indexed books (isbn not listed in
   * assortmentMap) are rejected.
   *
   * @param isbn    as the identifier of the book in question
   * @param comment as a string representing the comment to be added
   */
  void addComment(long isbn, String comment);

  /**
   * Removes a previously stored comment for a specific book.
   *
   * @param isbn      as the identifier of the book in question
   * @param commentId as the id of the comment to be removed
   */
  void deleteComment(long isbn, long commentId);

  /**
   * Removes all previously stored comments for a specific book.
   *
   * @param isbn as the identifier of the book in question
   */
  void removeAllCommentsForBook(long isbn);

  /**
   * Overwrites an already existing specific comment for a specific book.
   *
   * @param isbn           as the identifier of the book in question
   * @param commentId      as the id of the comment to be overwritten
   * @param updatedComment as a string representing the updated comment
   */
  void editComment(long isbn, long commentId, String updatedComment);

}
