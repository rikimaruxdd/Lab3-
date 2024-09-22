public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
            name = "Joe";
            address = "123 Sesame St";
            phoneNumber = "000 000 0000";
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
    }

    public String getName() {
            return name;
        }

    }

