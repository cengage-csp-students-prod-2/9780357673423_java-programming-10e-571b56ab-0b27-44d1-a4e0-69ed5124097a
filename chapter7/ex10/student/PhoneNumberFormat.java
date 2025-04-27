// Write your code here
import java.util.Scanner;
public class PhoneNumberFormat{
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.print("Enter an area code and phone number as a series of 10 digits Enter 999 to quit >> ");


        String phone = key.nextLine();

        while ( phone != "999" ){
            if (phone.length() == 10){
            System.out.println("The number is (" + phone.substring(0,3) + ") " + phone.substring(3,3) + "-" + phone.substring(6) );
            }
            else{
                System.out.println("The number is invalid");
            }
            System.out.print("Enter an area code and phone number as a series of 10 digits and I will display it in a nice format Enter 999 to quit >> ");
            phone = key.nextLine();
        }

    }
}