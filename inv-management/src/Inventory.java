import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private String task;
    private Scanner input = new Scanner(System.in);
    private ArrayList<Item> bag = new ArrayList<>();

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void chooseTask() throws Exception {
        while (this.task == null) {
            listItem();
            System.out.format("what would you like to do?\n [1] create new Item\n [2] sell Item\n" +
                    " [3] remove Item\n [4] update quantity\n [5] update price\n [6] quit\n");
            String task = input.nextLine();
            if(task.equalsIgnoreCase("1")){
                addItem();

            } else if(task.equalsIgnoreCase("2")){
                System.out.format("what would you like to sell? (enter number)\n");
                listItem();
                sellStock();
            } else if(task.equalsIgnoreCase("3")){
                System.out.format("what would you like to remove?(enter name)\n");
                listItem();
                removeItem();

            } else if(task.equalsIgnoreCase("4")){
                listItem();
                System.out.format("which item would you like to change the quantity of?(enter number)\n");
                updateStock();

            } else if(task.equalsIgnoreCase("5")){
                listItem();
                System.out.format("which item would you like to change the price of?(enter number)\n");
                changePrice();

            } else if(task.equalsIgnoreCase("6")){
                this.task = "";
            }
        }
    }


    public void addItem(){
        Item newItem = new Item();
        bag.add(newItem);
        System.out.format("item: (%s) was added to your inventory\n", newItem);
    }

    public void listItem(){
        int n = 0;
        for (Item item: bag){
            n++;
            System.out.format("%s. %s\n",n, item);
        }
    }

    public void sellStock() throws Exception {
        int choice = Integer.parseInt(input.nextLine()) - 1;
        System.out.format("%s stock is %s, how many would you like to sell? ", bag.get(choice),
                bag.get(choice).getStock());
        int v = Integer.parseInt(input.nextLine());
        if(bag.get(choice).getStock() >= v){
            bag.get(choice).setStock(bag.get(choice).getStock() - v);

        }
        else{
            throw new Exception("you can sell that many");
        }

    }
    public void removeItem() {
        String choice = input.nextLine();
        for(Item item: bag){
            if(choice.equalsIgnoreCase(item.getName())){
                bag.remove(item);
            }
        }
    }
    public void updateStock(){
        int choice = Integer.parseInt(input.nextLine()) - 1;
        System.out.format("what is the new stock of %s? ",bag.get(choice));
        int amount = Integer.parseInt(input.nextLine());
        bag.get(choice).setStock(amount);
    }
    public void changePrice(){
        int choice = Integer.parseInt(input.nextLine()) - 1;
        System.out.format("what is the new price of %s? ", bag.get(choice));
        int amount = Integer.parseInt((input.nextLine()));
        bag.get(choice).setPrice(amount);

    }
}


