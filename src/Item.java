import java.util.ArrayList;

/**
 * Created by strejolopez on 12/2/16.
 */
public class Item {
    private String name;
    private int price;
    private int quantitInStock;

    public Item(String name, int price, int quantitInStock){
        this.name = name;
        this.price = price;
        this.quantitInStock = quantitInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantitInStock() {
        return quantitInStock;
    }

    public void setQuantitInStock(int quantitInStock) {
        this.quantitInStock = quantitInStock;
    }

}
