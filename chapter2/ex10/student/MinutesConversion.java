// Write your code here


import java.util.Scanner;
public class MinutesConversion{
public static void main(String[] args){

    int minutes; double hours, days;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter minutes >> ");

    minutes = input.nextInt();

    final double hours_in_day = 24;
    final double minutes_in_day = 60;

    hours = minutes / minutes_in_day;
    days = hours / hours_in_day;

    System.out.printf("%d minutes is %f hours or %f days.", minutes, hours , days);


}

}