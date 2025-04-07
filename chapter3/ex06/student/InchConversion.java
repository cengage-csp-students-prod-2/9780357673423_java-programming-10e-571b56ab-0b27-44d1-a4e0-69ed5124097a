// Write your code here

import java.util.Scanner;
public class InchConversion{
    
    public static void main(String[] args){

        Scanner san = new Scanner(System.in);
        System.out.print("Enter inches >> ");
        float inches = san.nextFloat();

        convertToFeet(inches);
        convertToYards(inches);
    }

    public static void convertToFeet(float inches){

        System.out.println(inches + " inches is "+ inches / 12 + " feet");
    }

    public static void convertToYards(float inches){

        System.out.println(inches + " inches is "+ inches / 36 + " yards");
    }

}