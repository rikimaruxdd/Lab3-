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
    public BuddyInfo removeBuddy(int index) {

        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;

    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Mohammad",
                "1600 Pennsylvania Avenue",
                "999");
        System.out.println("Hello " + buddy.getName());


        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("lab3");
    }
}
