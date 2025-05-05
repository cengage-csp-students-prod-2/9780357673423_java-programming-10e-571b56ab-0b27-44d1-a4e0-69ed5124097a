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
                String phone = scan.next();
                IncomingPhoneCall IPC = new IncomingPhoneCall(phone);
                IPC.display();
                
            }
            else if (ch == ('O')){
                System.out.print("Enter the phone number >> ");
                String phone = scan.next();
                System.err.print("Enter minutes >> ");
                double time = scan.nextDouble();
                OutgoingPhoneCall OPC = new OutgoingPhoneCall(phone,time);
                OPC.display();
            }
            else if (ch == ('Q')) {
                break;
            }

        }
    }
}