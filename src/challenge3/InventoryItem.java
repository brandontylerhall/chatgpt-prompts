package challenge3;

public class InventoryItem implements Comparable<InventoryItem> {
    private int itemCode;
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public InventoryItem(int itemCode, String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    @Override
    public int compareTo(InventoryItem otherItem) {
        return Integer.compare(this.itemCode, otherItem.itemCode);
    }
}
