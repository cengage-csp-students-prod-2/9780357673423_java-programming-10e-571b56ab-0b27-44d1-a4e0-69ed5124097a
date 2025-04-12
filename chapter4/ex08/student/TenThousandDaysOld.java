// Write your code here
import java.time.LocalDate;
import java.util.Scanner;
public class TenThousandDaysOld{
    public static void main(String[] args){
        LocalDate date;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month as an integer >> ");

        int month = input.nextInt();

        System.out.print("Enter your birth day as an integer >> ");
        
        int day = input.nextInt();

        System.out.print("Enter your birth year as an integer >> ");
        
        int year = input.nextInt();

        date = LocalDate.of(year, month, day);

        System.out.print("You are 10000 days old on " + date.plusDays(10000));


    }
}