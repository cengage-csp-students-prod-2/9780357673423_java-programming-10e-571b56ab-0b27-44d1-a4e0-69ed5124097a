// Write your code here

import java.util.Scanner;

public class Insurance{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current year >> ");
        int current_year = input.nextInt();

        System.out.print("Enter the birth year >> ");
        int birth_year = input.nextInt();

        int amount = calculatePremium(current_year, birth_year);
        System.out.print("The premium is $" + amount);
    }

    public static int calculatePremium(int cYear, int bYear){

        int decade = (cYear - bYear)/10;

        return (decade + 15 ) * 20;

    }
}