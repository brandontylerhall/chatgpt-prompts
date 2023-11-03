package challenge3;

import util.Input;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryListManager inventoryList = new InventoryListManager();
        Input in = new Input();
        boolean quit = false;

        do {
            System.out.println("Select the function number you would like to perform.");
            System.out.printf("" +
                    "1. Add an item%n" +
                    "2. Remove an item%n" +
                    "3. Show inventory%n" +
                    "4. Calculate total inventory value%n" +
                    "5. Close program%n" +
                    "> ");
            int userSelection = in.getInt();
            switch (userSelection) {
                case 1 -> inventoryList.addItem();
                case 2 -> inventoryList.removeItem();
                case 3 -> inventoryList.printInventory();
                case 4 -> inventoryList.calculateTotalValue();
                case 5 -> quit = true;
            }
        } while (!quit);
        System.out.println("Ok bye!");
    }
}