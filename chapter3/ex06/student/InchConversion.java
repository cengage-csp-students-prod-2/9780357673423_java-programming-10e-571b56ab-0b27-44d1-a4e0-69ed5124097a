// Write your code here

import java.util.Scanner;
public class InchConversion{
    
    public static void main(String[] args){

        Scanner san = new Scanner(System.in);
        System.out.print("Enter inches >> ");
        int inches = san.nextInt();

        convertToFeet(inches);
        convertToYards(inches);
    }


    public static void convertToFeet(int inches){
        final double INCHES_TO_FT = 12;

        double ans = inches / INCHES_TO_FT;

        System.out.println(inches + " inches is "+ ans + " feet");
    }

    public static void convertToYards(int inches){
        final double INCHES_TO_YD = 36;

        double ans = inches / INCHES_TO_YD;

        System.out.println(inches + " inches is "+ ans + " yards");
    }

}