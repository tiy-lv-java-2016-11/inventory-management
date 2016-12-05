import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lbregula on 12/1/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> actions = new HashMap<>();
        Inventory inventory1 = new Inventory();
        inventory1.display();

        actions.put(1, "Create a new item by entering its name, price and quantity");
        actions.put(2, "Let them choose how many items should be sold");
        actions.put(3, "Remove item by name");
        actions.put(4, "Pick an item and update the quantity of that item");
        actions.put(5, "Pick an item and update the price of the item");
        actions.put(6, "Quit Program");


        System.out.println("\nThese are the actions you can take:\n");

        for (Map.Entry<Integer, String> entry : actions.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println("What would you like to do?");
        String action = input.nextLine();

        while (action != "6") {

            if (action.equals("1")) {
                inventory1.addNewItemToInventory();

            } else if (action.equals("2")) {
                inventory1.howManyItemsToBeSold();
            } else if (action.equals("3")) {

                inventory1.removeItem();
            } else if (action.equals("4")) {

                inventory1.updateQuantity();
            } else if (action.equals("5")) {

                inventory1.updatePrice();
            } else if (action.equals("6")) {

                return;
            } else {
                System.out.println("please enter a valid option");
            }
            System.out.println("What would you like to do?");

            for (Map.Entry<Integer, String> entry : actions.entrySet()) {
                int key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " " + value);
            }

            action = input.nextLine();

        }
    }

}
