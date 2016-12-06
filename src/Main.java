
/**
 * Created by melmo on 12/1/16.
 */
public class Main {

    public static void main(String[] args) {

        Inventory myFridge = new Inventory();
        myFridge.addUser("melmo", "teddy");
        myFridge.addUser("ginger", "tux1");

        myFridge.login();


    }
}
