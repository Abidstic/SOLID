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
                Customer.totalcost-=1500;

                break;
            case 2:
                room="Double";
                Customer.totalcost-=2500;
                break;
            case 3:
                room="Deluxe";
                Customer.totalcost-=4000;
                break;
        }
        System.out.println("Customer:"+userName);
        System.out.println("\nThanks for using Hotel SUST\n");
        System.out.println("You have Cancelled "+roomAmount+" "+room+" rooms\n");
        System.out.println("Your Total Cost is "+Customer.totalcost+" taka");
        System.out.println("Have a nice day");



    }
}
