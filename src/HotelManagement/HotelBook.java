package HotelManagement;

import java.util.Scanner;

public class HotelBook {
    public static void main(String[] args) {

        String username;
        int Command,roomType,roomAmount;
        boolean x=true;
        Scanner input=new Scanner(System.in);
        Customer customer=new Customer();
        System.out.println("==Welcome To Hotel SUST==");
        System.out.println("\n\nEnter Your Name:");
        username=input.nextLine();
        System.out.println("Choose Your Options:\n");

        while(x){

            System.out.println("1.Online Booking\n2.On Spot Booking\n3.Cancellation\n");
            Command=input.nextInt();
            if(Command==1)
            {

                System.out.println("What type of room do you want:\n");
                System.out.println("1.Single\n2.Double\n3.Delux\n");
                roomType=input.nextInt();
                System.out.println("\nHow many rooms do you need:");
                roomAmount= input.nextInt();
                customer.roomBookingOnline(username,roomType,roomAmount);
                customer.displayInformation(username);

            }
            else if(Command==2)
            {
                System.out.println("Enter Your Name:");
                username=input.nextLine();
                System.out.println("\nWhat type of room do you want:\n");
                System.out.println("1.Single\n2.Double\n3.Delux\n");
                roomType=input.nextInt();
                System.out.println("\nHow many rooms do you need:");
                roomAmount= input.nextInt();
                customer.roomBookingOnSpot(username,roomType,roomAmount);
                customer.displayInformation(username);

            }
            else
            {
                System.out.println("Enter Your Name:");
                username=input.nextLine();
                System.out.println("\nWhat type of room did you booked:\n");
                System.out.println("1.Single\n2.Double\n3.Delux\n");
                roomType=input.nextInt();
                System.out.println("\nHow many rooms did you booked:");
                roomAmount= input.nextInt();
                customer.cancel(username,roomType,roomAmount);

            }
            System.out.println("Do you still like to continue?\n");
            System.out.println("1.Yes\n2.No\n");
            int a=input.nextInt();
            if(a==1)x=true;
            else
            {
                x=false;
                break;
            }
        }





    }
}
