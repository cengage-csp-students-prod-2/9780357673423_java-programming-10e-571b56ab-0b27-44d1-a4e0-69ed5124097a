// Write your code here
// Write your code here
import java.util.Scanner;
public class ChiliTOGo{

    public static void main(String[] args){
        double adult, child;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of adult meals ordered >> ");
        adult = input.nextDouble();
        System.out.print("Enter number of child meals ordered >> ");
        child = input.nextDouble();

        System.out.print(adult + "adult meals were ordered at $" + 7.0 + " each.");
        System.out.print("Total is $" + adult * 7.0);

        System.out.print(child + "child meals were ordered at $" + 4.0 + " each.");
        System.out.print("Total is $" + child * 7.0);

        System.out.print("Grand total for all meals is $" + adult * child * 28.0);






    }

}