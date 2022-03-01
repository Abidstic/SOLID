package HotelManagement;

public class RoomType implements OnSpotCost,OnlineCost {
    String userName;
    int roomType,roomAmount;
   int cost=0;
//
    @Override
    public void information(String userName, int roomType, int roomAmount) {
        this.userName=userName;
        this.roomAmount=roomAmount;
        this.roomType=roomType;
        switch (roomType)
        {
            case 1:
                cost+=1500;
                break;
            case 2:
                cost+=2500;
                break;
            case 3:
               cost+=4000;
                break;

        }

    }

    @Override
    public int calculatepriceOnline() {

        cost=(cost*roomAmount);
        return cost;
    }

    @Override
    public int  calculateprice() {

        return cost*=roomAmount;
    }

}
