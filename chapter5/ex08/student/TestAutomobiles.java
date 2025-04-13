// Write your code here
import java.util.Scanner;
public class TestAutomobiles{
    private Automobile object1, object2;

    public static void main(String[] args){

        int id, year;
        double miles;
        String make, model, color;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID (an integer) >> ");
        id = input.nextInt();

        System.out.print("Enter make >> ");
        make = input.nextLine() ;
        System.out.print("Enter model >> ");
        model = input.nextLine();
        System.out.print("Enter color >> ");
        color = input.nextLine();

        System.out.print("Enter year (4 digits) >> ");
        year = input.nextInt();
        System.out.print("Enter mpg >> ");
        miles = input.nextDouble();
        Automobile auto = new Automobile(id, year, miles, make,model,color);
        System.out.println("ID#" + auto.getId()+ " " + auto.getMake()+ " " + auto.getModel()+ " " + auto.getColor() + " "+ auto.getYear() + " " + auto.getMiles()+   " miles per gallon" );
    }

}