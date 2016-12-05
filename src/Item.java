/**
 * Created by melmo on 12/1/16.
 */
public class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString(){
        String str = String.format("%-15s %5s $%.2f", "<"+this.name+">", this.quantity+" @", this.price);
        return str;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int qty){
        this.quantity = qty;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
