package HotelManagement;

public class Customer {

    String userName;
    static int totalcost=0;
    Cancel cancel;
    RoomType room;

     Customer() {
        cancel=new Cancel();
         room=new RoomType();
    }

    void displayInformation(String userName)
    {
        this.userName=userName;
        System.out.println("Customer:"+userName);
        System.out.println("\nThanks for booking in our Hotel SUST\n");
        System.out.println("Your total cost is "+totalcost+" taka\n");
        System.out.println("Have a nice day\n");
    }
    void roomBookingOnSpot(String userName,int roomtype,int roomAmount)
    {

        room.information(userName, roomtype, roomAmount);
        totalcost+=room.calculateprice();
    }
    void roomBookingOnline(String userName,int roomtype,int roomAmount)
    {

        room.information(userName, roomtype, roomAmount);
        totalcost+=room.calculatepriceOnline();
    }
    void cancel(String userName,int roomtype,int roomAmount)
    {

        cancel.information(userName, roomtype, roomAmount);



    }


}
