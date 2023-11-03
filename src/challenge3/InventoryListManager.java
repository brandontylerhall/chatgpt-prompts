package challenge3;

import util.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class InventoryListManager {
    private ArrayList<InventoryItem> inventoryList;

    public InventoryListManager() {
        this.inventoryList = new ArrayList<>();
    }

    private Input in = new Input();

    public void addItem() {
        System.out.print("Enter item code: ");
        int newItemCode = in.getInt();
        in.getLine();

        System.out.print("Enter item name: ");
        String newItemName = in.getLine();

        System.out.print("Enter price per unit: ");
        double newItemPrice = in.getDouble();
        in.getLine();

        System.out.print("Enter quantity: ");
        int newItemQuantity = in.getInt();
        in.getLine();

        inventoryList.add(new InventoryItem(newItemCode, newItemName, newItemPrice, newItemQuantity));
        System.out.printf("Item added successfully!%n");
    }

    public void removeItem() {
        printInventory();
        System.out.print("Enter the item name you wish to delete: ");
        String itemNameToRemove = in.getLine();
        boolean itemFound = false;
        InventoryItem removedItem = null;

// Iterate through the inventoryList to find the item with the specified itemName
        for (InventoryItem item : inventoryList) {
            if (Objects.equals(item.getItemName(), itemNameToRemove)) {
                removedItem = item;
                itemFound = true;
                break;
            }
        }

// Remove the item if found, otherwise display a message
        if (itemFound) {
            inventoryList.remove(removedItem);
            System.out.printf("Removed: %s%n", removedItem.getItemName());
        } else {
            System.out.println("You don't have anything with that item number, pal.");
        }
    }

    public void printInventory() {
        Collections.sort(inventoryList);
        System.out.println("Inventory:");
        for (InventoryItem item : inventoryList) {
            System.out.printf("| Item Code: %s | Item Name: %s | Item Price: %.2f | Item Quantity: %s |%n", item.getItemCode(), item.getItemName(), item.getItemPrice(), item.getItemQuantity());
        }
    }

    public void calculateTotalValue() {
        double sum = 0;
        for (InventoryItem items : inventoryList) {
            sum += items.getItemPrice() * items.getItemQuantity();
        }
        System.out.printf("The total value of the inventory is: %.2f%n", sum);
    }
}