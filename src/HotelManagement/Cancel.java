package HotelManagement;

public class Cancel implements Cancellation {
    String userName;
    int roomType,roomAmount;
    String room;

    @Override
    public void information(String userName, int roomType, int roomAmount) {
        this.userName=userName;
        this.roomAmount=roomAmount;
        this.roomType=roomType;
        switch (roomType)
        {
            case 1:
                room="Single";
                break;
            case 2:
                room="Double";
                break;
            case 3:
                room="Delux";
                break;
        }
        System.out.println("Customer:"+userName);
        System.out.println("\nThanks for using Hotel SUST\n");
        System.out.println("You have Cancelled "+roomAmount+" "+room+" rooms\n");
        System.out.println("Have a nice day");



    }
}
