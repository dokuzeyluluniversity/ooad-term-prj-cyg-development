package sample.Interfaces;

import sample.products.Item;
import sample.utility.Receipt;
import sample.utility.Date;

public interface SalesManager {
    /**
     * Sells specified item in given quantity
     */

    public void sellItem(Item item, int quantity);
    /**
     * Generates final receipt of customer and saves it
     */

    public void generateReceipt(Item []items);

    /**
     * Finds and returns specified receipt
     */

    public Receipt searchReceipt​(int receiptID, Date date);

    /**
     * Returns an item and saves a return receipt
     */

    public void returnItem(Item item, int receiptID);
}
