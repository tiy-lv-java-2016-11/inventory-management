import java.util.ArrayList;

/**
 * Created by strejolopez on 12/2/16.
 */
    public class Inventory {

        private ArrayList<Item> items = new ArrayList<>();

        public Inventory() {
            Item banana = new Item("banana", 1, 30);
            items.add(banana);

            Item apple = new Item("apple", 3, 10);
            items.add(apple);

            Item orange = new Item("orange", 5, 6);
            items.add(orange);
        }

        for(Item : items){
        System.out.println(items);
        }

        public ArrayList<Item> getItems() {
            return items;
        }

        public void setItems(ArrayList<Item> items) {
            this.items = items;
        }

    }



