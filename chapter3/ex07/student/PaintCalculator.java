// Write your code here
import java.util.Scanner;
public class PaintCalculator{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the room's length >> ");
        double len = input.nextDouble();
        System.out.print("Enter the room's width >> ");
        double wid = input.nextDouble();
        System.out.print("Enter the room's height >> ");
        double hei = input.nextDouble();

        double price = computeArea(len, wid, hei);
        System.out.print("The price to paint the room is $" + price);



    }

    public static double computeArea(double len, double wid , double hei){

        // double area = (len * wid) + (len + hei) + (hei* wid);
        double area = (len * wid * hei);
        double gallon = computeGallons(area);
        System.out.println("You will need " + gallon + " gallons");
        return 32 * gallon;

    }

    public static double computeGallons(double area){

        return area / 350;


    }
}