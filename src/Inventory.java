import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by darionmoore on 12/1/16.
 */
public class Inventory {
    private ArrayList<Item> Inventory = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private Item newItem = new Item();

    public Inventory() {
        Inventory.add(newItem);
    }
    public void itemList() {
        for(Item newItem : Inventory) {
            System.out.println("Here's what is in stock: \n" + Inventory.toString());
        }
    }
    public void options() throws Exception {
        boolean run = true;
        while(run) {
            System.out.println("What would you like to do?\n");
            System.out.println("[1] Make an Item? Add the price and stock. \n");
            System.out.println("[2] Sell an item? \n");//check if there are enough left in inventory and if not throw an exception
            System.out.println("[3] Remove an item? \n");
            System.out.println("[4] Update an items quantity? \n");
            System.out.println("[5] Update an items price? \n");
            System.out.println("[6] Quit? \n");
            int choices = input.nextInt();
            if (choices == 1) {
                System.out.println("Name? \n");
                newItem.setName();
                System.out.println("Price? \n");
                newItem.setPrice();
                System.out.println("Stock? \n");
                newItem.setStock();
                Inventory.add(newItem);
            } else if (choices == 2) {
                System.out.println("What would you like to sell? \n");
                newItem.setName();
                System.out.println("How many? \n");
                newItem.setStock();
                newItem.sellItem();
                Inventory.remove(newItem);
            } else if (choices == 3) {
                System.out.println("What would you like to remove?\n");
                newItem.setName();
                Inventory.remove(newItem);
            } else if (choices == 4) {
                System.out.println("What item would you like to update?\n");
                newItem.setName();
                newItem.setBackStock();
                Inventory.add(newItem);
            } else if (choices == 5) {
                System.out.println("What items price would you like to change?");
                newItem.setName();
                newItem.setPrice();
                Inventory.add(newItem);
            } else if (choices == 6) {
                run = false;
            }
        }




    }
}
















