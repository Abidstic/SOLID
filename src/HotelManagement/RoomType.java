package HotelManagement;

public class RoomType implements OnSpotCost,OnlineCost {
    String userName;
    int roomType,roomAmount;
//    int cost=0;
//
    @Override
    public void information(String userName, int roomType, int roomAmount) {
        this.userName=userName;
        this.roomAmount=roomAmount;
        this.roomType=roomType;
        switch (roomType)
        {
            case 1:
                Customer.cost+=1500;
                break;
            case 2:
                Customer.cost+=2500;
                break;
            case 3:
                Customer.cost+=4000;
                break;

        }

    }

    @Override
    public void calculatepriceOnline() {
        Customer.cost*=roomAmount/2;
    }

    @Override
    public void calculateprice() {
        Customer.cost*=roomAmount;
    }

}
