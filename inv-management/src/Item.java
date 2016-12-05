import java.util.Scanner;

public class Item {
    private String name;
    private Integer price;
    private Integer stock;
    private Scanner input = new Scanner(System.in);

    public Item(){
        System.out.format("name:");
        this.name = input.nextLine();
        System.out.format("price:");
        this.price = Integer.parseInt(input.nextLine());
        System.out.format("stock:");
        this.stock = Integer.parseInt(input.nextLine());
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;

    }
    public void setPrice(int price){
        this.price = price;

    }
    @Override
    public String toString(){
        return this.name;
    }
}

