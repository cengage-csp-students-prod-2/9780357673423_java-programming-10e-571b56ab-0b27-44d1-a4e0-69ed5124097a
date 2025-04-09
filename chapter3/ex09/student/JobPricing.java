// Write your code here
import java.util.Scanner;
public class JobPricing{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter job description >> ");
        String job = input.nextLine();
        System.out.print("Enter cost of materials >> ");
        double cMaterials = input.nextDouble();

        System.out.print("Enter hours on the job work >> ");
        double hours = input.nextDouble();

        System.out.print("Enter hours traveling >> ");
        double hTravel = input.nextDouble();

        double result = computePrice(cMaterials, hours, hTravel);
        System.out.print("The price for " + job +" is $" + result);
        
        





    }
    public static double computePrice(double cMaterials, double hours, double hTravel ){


        return (cMaterials + (35 * hours) + (12 * hTravel));
    } 

}