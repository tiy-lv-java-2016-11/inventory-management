import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by darionmoore on 12/2/16.
 */
public class Item {
    private String name;
    private double price;
    private int stock;
    private int backStock = 5;
    private Scanner userInput = new Scanner(System.in);

    public Item() {
        this.name = getName();
        this.price = getPrice();
        this.stock = getStock();
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = userInput.nextLine();
    }
    public double getPrice() {
        return price;
    }
    public void setPrice() {
        this.price = userInput.nextDouble();
    }
    public int getStock() {
        return stock;
    }
    public void setStock() {
        this.stock = userInput.nextInt();
    }
    public int getBackStock() {
        return backStock;
    }
    public void setBackStock() {
        this.backStock = userInput.nextInt();
    }
    public void sellItem() throws Exception {
        if (this.getStock() > this.getBackStock())  {
            throw new Exception("You don't have enough in stock.");
        } else if (this.getStock() <= this.getBackStock()){
            this.stock -= this.backStock;
        }
    }



}
