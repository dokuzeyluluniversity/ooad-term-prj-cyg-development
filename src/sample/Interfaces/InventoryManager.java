package sample.Interfaces;

import sample.products.Item;
import sample.company.Shop;

public interface InventoryManager {
    /**
     *  Adds an already existing item to mentioned branch
     */
    public void addItemToShop(Item item, Shop shopToAdd, int quantity);
    /**
     *  Removes an already existing item from a branch in specified quantity
     */
    public void removeItemFromShop(Item item, Shop shopToAdd, int quantity);
    /**
     * Creates a new Item
     */
    public void addNewItem(Item item);
    /**
     *  Removes an existing item from all branches and marks it as removed
     */
    public void removeItem(Item item);
    /**
     *  Transfers specified product from origin Shop to destination
     */
    public void transferBetweenBranches(Shop originShop, Shop destinationShop, Item transferredItem, int quantity);
    /**
     *  Orders items in specified quantity from the item’s manufacturer
     */
    public void orderItem(Item item, int quantity);
    /**
     *  Searches and returns an item from Inventor
     */
    public Item searchItem(int ItemID);

}
