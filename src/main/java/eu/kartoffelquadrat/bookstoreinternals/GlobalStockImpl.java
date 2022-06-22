package eu.kartoffelquadrat.bookstoreinternals;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implementation for the GlobalStock interface.
 *
 * @author Maximilian Schiedermeier
 */
public class GlobalStockImpl implements GlobalStock {

    private static GlobalStock singletonReference;
    Map<String, LocalStock> stocksPerCity;

    /**
     * Private constructor for singleton pattern. Implicitly populates the stocksPerCity map, so that the one and only
     * instance of this class has some data to work with.
     */
    private GlobalStockImpl() {

        stocksPerCity = new LinkedHashMap<>();
        populateWithDummyData();
    }

    /**
     * Singleton access method.
     *
     * @return the singleton instance.
     */
    public static GlobalStock getInstance() {

        if (singletonReference == null)
            singletonReference = new GlobalStockImpl();

        return singletonReference;
    }

    /**
     * Returns the amount in stock of a given book in a given city
     *
     * @param city for the city of interest
     * @param isbn for book id of interest
     * @return the amount in stock
     */
    @Override
    public int getStock(String city, Long isbn) {

        if (!stocksPerCity.containsKey(city))
            throw new RuntimeException("Can not lookup amount in stock. No such city: " + city);

        return stocksPerCity.get(city).getAmount(isbn);
    }

    /**
     * Updates the stock for a given city
     *
     * @param city   for the city of interest
     * @param isbn   for book id of interest
     * @param amount for the new amount in stock
     */
    @Override
    public void setStock(String city, Long isbn, Integer amount) {

        if (!stocksPerCity.containsKey(city))
            throw new RuntimeException("Can not update amount in stock. No such city: " + city);

        stocksPerCity.get(city).setAmount(isbn, amount);
    }

    /**
     * Returns a list of all cities that have a local stock
     *
     * @return a list of all cities (strings)
     */
    @Override
    public Collection<String> getStoreLocations() {
        return stocksPerCity.keySet();
    }

    /**
     * Returns the entire stock of a local store.
     *
     * @param city for the city of interest
     * @return a map holding for each book (by isbn) the amount of books in stock at the specified location.
     */
    @Override
    public Map<Long, Integer> getEntireStoreStock(String city) {
        return stocksPerCity.get(city).getEntireStock();
    }

    /**
     * Helper method to add some dummy stock data for all local branches. Should be invoked upon creation of this
     * class.
     */
    private void populateWithDummyData() {

        // Add some locations.
        stocksPerCity.put("Montréal", new LocalStockImpl());
        stocksPerCity.put("München", new LocalStockImpl());
        stocksPerCity.put("Osterhofen", new LocalStockImpl());
        stocksPerCity.put("Lyon", new LocalStockImpl());

        // initialize stock for locations.
        stocksPerCity.get("Montréal").setAmount(Long.parseLong("9780739360385"), 1);
        stocksPerCity.get("Montréal").setAmount(Long.parseLong("9781977791122"), 2);
        stocksPerCity.get("Montréal").setAmount(Long.parseLong("9780262538473"), 3);

        stocksPerCity.get("München").setAmount(Long.parseLong("9780739360385"), 50);
        stocksPerCity.get("München").setAmount(Long.parseLong("9780553382563"), 2);
        stocksPerCity.get("München").setAmount(Long.parseLong("9781977791122"), 7);

        stocksPerCity.get("Osterhofen").setAmount(Long.parseLong("9780739360385"), 15);
        stocksPerCity.get("Osterhofen").setAmount(Long.parseLong("9780553382563"), 2);
        stocksPerCity.get("Osterhofen").setAmount(Long.parseLong("9781977791122"), 5);
        stocksPerCity.get("Osterhofen").setAmount(Long.parseLong("9780262538473"), 8);

        stocksPerCity.get("Lyon").setAmount(Long.parseLong("9780739360385"), 4);
        stocksPerCity.get("Lyon").setAmount(Long.parseLong("9780262538473"), 2);
    }

    /**
     * Helper method to convert all stored stock information into human readable format.
     *
     * @return A nicely formatted string listing all local stocks.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n **************\n *    Stock   * \n **************\n");
        for (String city : stocksPerCity.keySet()) {
            sb.append(city).append(":\n");
            sb.append(stocksPerCity.get(city));
        }
        return sb.toString();
    }

}
