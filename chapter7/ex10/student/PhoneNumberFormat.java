import java.util.Scanner;
public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter an area code and phone number as a series of 10 digits\nEnter 999 to quit >> ");
        
        String phone = key.nextLine();

        while (!phone.equals("999")) {
            if (phone.length() == 10) {
                System.out.println("The number is (" + phone.substring(0,3) + ") " + phone.substring(3,6) + "-" + phone.substring(6));
            } else {
                System.out.println("The number is invalid");
            }
            System.out.print("\nEnter an area code and phone number as a series of 10 digits\nand I will display it in a nice format\nEnter 999 to quit >> ");
            
            if (key.hasNextLine()) {
                phone = key.nextLine();
            } else {
                break; // End of input, exit the loop
            }
        }
        key.close();
    }
}
