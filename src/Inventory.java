import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lbregula on 12/1/16.
 */
public class Inventory {
    private HashMap<String, Item> inventoryHashMap = new HashMap<>();
    private Scanner input = new Scanner(System.in);

    public Inventory() {
        inventoryHashMap.put("Apples", new Item("Apples", 10, 1.50));
        inventoryHashMap.put("Bananas", new Item("Bananas", 20, 1.00));
        inventoryHashMap.put("Pears", new Item("Pears", 30, 2.5));
    }

    public void display() {
        for (String key : inventoryHashMap.keySet()) {
            Item item = inventoryHashMap.get(key);
            System.out.println(item.getName()+ " ," + item.getQuantity()+ " , " +item.getPrice());
        }
    }

    public void addNewItemToInventory() {
        System.out.println("create a new item");
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter quantity");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.println("Enter price");
        double price = Double.parseDouble(input.nextLine());
        Item tempItem = new Item(name, quantity, price);
        inventoryHashMap.put(tempItem.getName(), tempItem);

    }

    public void howManyItemsToBeSold() throws Exception {
        System.out.println("Which Item would you like to sell?");
        String itemName = input.nextLine();
        System.out.println("How many would you like to sell?");
        int quantity = Integer.parseInt(input.nextLine());
        Item toBeSold = inventoryHashMap.get(itemName);
        int originalQuantity = toBeSold.getQuantity();
        if (originalQuantity < quantity) {
            throw new Exception("You do not have enough");
        }
        toBeSold.setQuantity(originalQuantity - quantity);
    }

    public void removeItem() {
        System.out.println("What item would you like to remove?");
        String itemName = input.nextLine();
        inventoryHashMap.remove(itemName);

    }

    public void updateQuantity() {
        System.out.println("Choose an item and update the quantity of that item");
        String itemName = input.nextLine();
        System.out.println("input updated quantity");
        int quantity = Integer.parseInt(input.nextLine());
        Item item = inventoryHashMap.get(itemName);
        item.setQuantity(quantity);

    }

    public void updatePrice() {
        System.out.println("Please pick an item to update the price of");
        String itemName = input.nextLine();
        System.out.println("update the price");
        double price =  Double.parseDouble(input.nextLine());
        Item item = inventoryHashMap.get(itemName);
        item.setPrice(price);
    }
}

