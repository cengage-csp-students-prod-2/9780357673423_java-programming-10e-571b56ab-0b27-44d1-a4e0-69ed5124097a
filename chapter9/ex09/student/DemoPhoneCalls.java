// Write your code here
import java.util.Scanner;
public class DemoPhoneCalls{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Is this call (I)ncoming or (O)utgoing?\nOr enter Q to quit >> ");
            String input = scan.nextLine();
            if (input.isEmpty()) {
                continue; // Skip empty input
            }
            
            char ch = input.charAt(0);
            if (ch == ('I')){
                System.out.print("Enter the phone number >> ");
                String phone = scan.nextLine();
                PhoneCall IPC = new IncomingPhoneCall(phone);
                IPC.getInfo();
                
            }
            else if (ch == ('O')){
                System.out.print("Enter the phone number >> ");
                String phone = scan.nextLine();
                System.err.print("Enter minutes >> ");
                int time = scan.nextInt();
                PhoneCall OPC = new OutgoingPhoneCall(time,phone);
                OPC.getInfo();
            }
            else if (ch == ('Q')) {
                break;
            }
            else {
        System.out.println("Invalid input. Try again.");
    }

        }
        scan.close();
    }
}