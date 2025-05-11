// Write your code here
import java.util.Scanner;
public class UseDivision {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Is this for a (D)omestic or (I)nternational division? >> ");

        String data = scan.nextLine();
        char ch = data.charAt(0);
        if (ch == 'D'){
            System.out.print("Enter division name >> ");
            String div = scan.nextLine();
            System.out.print("Enter acct number >> ");
            int acc = scan.nextInt();
            System.out.print("Enter state >> ");
            scan.next();
            String st = scan.nextLine();
            Division division = new DomesticDivision(acc,div,st );
            division.display();
        }

        else if(ch == 'I'){
            System.out.print("Enter division name >> ");
            String div = scan.nextLine();
            System.out.print("Enter acct number");
            int acc = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter country >> ");
            String ct = scan.nextLine();
            System.out.print("Enter language >> ");
            String lg = scan.nextLine();
            Division division = new InternationalDivision(acc, div, ct,lg );
            division.display();
        }

        }
    }

