// Write your code here
import java.util.Scanner;
public class DemoPhoneCalls{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Is this call (I)ncoming or (O)utgoing?\nOr enter Q to quit >> ");
            char ch = scan.nextLine().charAt(0);
            if (ch == ('I')){
                System.out.print("Enter the phone number >> ");
                String phone = scan.nextLine();
                PhoneCall IPC = new IncomingPhoneCall(phone);
                IPC.display();
                
            }
            else if (ch == ('O')){
                System.out.print("Enter the phone number >> ");
                String phone = scan.nextLine();
                System.err.print("Enter minutes >> ");
                double time = scan.nextDouble();
                PhoneCall OPC = new OutgoingPhoneCall(phone,time);
                OPC.display();
            }
            else if (ch == ('Q')) {
                break;
            }

        }
        scan.close();
    }
}