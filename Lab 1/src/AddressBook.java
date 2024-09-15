import java.util.ArrayList;
import java.util.List;
public class AddressBook {
    private BuddyInfo buddy;
    private ArrayList<BuddyInfo> buddies;


    public AddressBook() {

        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {
            buddies.add(buddy);
        }
    }
    public void removeBuddy(BuddyInfo buddy) {

        if (buddies.contains(buddy)) {
            buddies.remove(buddy);
        }


    }
}
