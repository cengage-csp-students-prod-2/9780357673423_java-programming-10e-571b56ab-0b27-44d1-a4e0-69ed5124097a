// Write your code here
import java.util.Scanner;
public class ChillTOGo{

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

        System.out.print("Grnad total for all meals is $" + adult * child * 28.0);


        System.out.print("Profits:");
        System.out.print("Adult profits is $" + adult * 2.65);
        System.out.print("Child profits is $" + child * 0.90);

        System.out.print("TOtal profits is $" + child * adult * 2.385);






    }

}