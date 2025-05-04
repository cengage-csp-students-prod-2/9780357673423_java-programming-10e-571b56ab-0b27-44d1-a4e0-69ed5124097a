// Write your code here
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayReminder{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Map<String,String> nameDate = new HashMap<>();
        int max_student = 10;
        int count = 0;
        
        while (count < max_student){
            System.out.print("Enter a name >> ");
            String n = in.nextLine();
            if ( n.equalsIgnoreCase("zzz") ){
                break;
            }
            
            System.out.print("Enter birthdate with slashes between the month, day, and year >> ");
            String date  = in.nextLine();
            nameDate.put(n, date);
            count++;
        }

        System.out.println("Count of names entered: "+ count);
        for (String name : nameDate.keySet()){
            System.out.println(name);
        }

        while (true) {
            System.out.print("Enter a name to search for or ZZZ to quit >> ");
            String n = in.nextLine();
            if (nameDate.containsKey(n)){
                System.out.println(n + "'s birthday is " + nameDate.get(n));
            }
            else if ( n.equalsIgnoreCase("zzz") ){
                break;
            }
            else{
                System.out.println("Sorry, no entry for " + n);
            }

        }
        in.close();
    }
}