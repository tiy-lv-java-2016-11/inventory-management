import java.util.Date;

/**
 * Created by melmo on 12/1/16.
 */
public class Event {
    private Date timestamp;
    private User user;
    private String action;
    private Item changedItem;

    public Event(Date timestamp, User user, String action, Item changedItem) {
        this.timestamp = timestamp;
        this.user = user;
        this.action = action;
        this.changedItem = changedItem;
    }

//    @Override
//    public String toString(){
//        String event =
//        return event;
//    }
}
