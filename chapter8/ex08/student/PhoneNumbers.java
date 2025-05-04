// Write your code here\
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneNumbers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        java.util.Map<String,String> namePhone = new HashMap<>(30);
        int max_entry = 30;
        int count = 0;
        String name;
        while (count < max_entry){

            System.out.print("Enter name to look up. Type 'quit' to quit. >> ");
            name = scan.nextLine();
            if (name.equalsIgnoreCase("quit")){
                break;
            }
            else if ( namePhone.containsKey(name) ){
                System.out.prinlnt(name + "'s phone number is " + namePhone.get(name));
            }
            else{
                System.out.println(name + " not found in current list");
                System.out.print("Enter phone number for "+ name + " >> ");
                String phone = scan.nextLine();
                namePhone.put(name,phone);

            }
            count ++;



        }
        scan.close();
    }
}