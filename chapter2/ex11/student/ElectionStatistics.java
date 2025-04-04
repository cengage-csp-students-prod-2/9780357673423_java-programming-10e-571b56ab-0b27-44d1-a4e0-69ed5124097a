// Write your code here
import java.util.Scanner;
public class ElectionStatistics{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        double p1, p2, p3 ;
        String n1;
        String n2;
        String  n3;
        System.out.print("Enter name for first party >> ");
        n1 = input.nextLine();
        System.out.print("Enter votes recieved >> ");
        p1 = input.nextDouble();

        System.out.print("Enter name for second party >> ");
        n2 = input2.nextLine();
        System.out.print("Enter votes recieved >> ");
        p2 = input2.nextDouble();


        System.out.print("Enter name for third party >> ");
        n3 = input3.nextLine();
        System.out.print("Enter vote recieved >> ");
        p3 = input3.nextDouble();

        double total = (p1 + p2 + p3 );
        double r1 = (p1 * 100)/total ;
        double r2 = (p2 * 100)/total ;
        double r3 = (p3 * 100)/total ;

        System.out.println("The " + n1 + " got " + r1 + " percent of the vote" );
        System.out.println("The " + n2 + " got " + r2 + " percent of the vote" );
        System.out.println("The " + n3 + " got " + r3 + " percent of the vote" );


    }
    
}

