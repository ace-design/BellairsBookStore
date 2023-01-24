package eu.kartoffelquadrat.bookstoreinternals;

/**
 * Legacy launcher class to demonstrate access and functionality of the bookstore.
 *
 * @author Maximilian Schiedermeier
 */
public class DesktopLauncher {

  /**
   * Creates a BookStore instance and prints the default data to screen.
   *
   * @param args not used. No runtime parameters expected.
   */
  public static void main(String[] args) {

    printData();
  }

  /**
   * Creates a BookStore instance and prints the default data to screen.
   */
  public static void printData() {
    Assortment assortment = AssortmentImpl.getInstance();
    Comments comments = CommentsImpl.getInstance();
    GlobalStock stock = GlobalStockImpl.getInstance();

    System.out.println("Welcome to the BookStore.");
    System.out.println("-------------------------");
    System.out.println("Here is a listing of the persisted data:");
    System.out.print(assortment);
    System.out.print(stock);
    System.out.print(comments);
  }
}
