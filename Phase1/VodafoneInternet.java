import java.util.Scanner;

public class VodafoneInternet extends InternetPaymentService{
    Scanner myobj =new Scanner(System.in);

    public VodafoneInternet(){
        obj =new Form();

    }
    public void getinfo(){
        System.out.println("enter your phone number: ");
        obj.phoneNumber = myobj.nextLine();
        System.out.println("enter your name: ");
        obj.userName = myobj.nextLine();
        System.out.println("enter your zip code: ");
        obj.zipCode = myobj.nextInt();
        System.out.println("enter the amount payed: ");
        obj.servicePrice = myobj.nextFloat();


    }

}