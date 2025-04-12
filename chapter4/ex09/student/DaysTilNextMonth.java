// Write your code here

import java.time.LocalDate;
import java.util.Scanner;
class Local_Data{
    public static int lengthOfMonth(LocalDate data){
        int day = data.getDayOfMonth();
        int daystillnextmonth = data.lengthOfMonth() - day;
        return daystillnextmonth;
    }
}

public class DaysTilNextMonth{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as an integer >> ");
        int month = input.nextInt();

        System.out.print("Enter the day >> ");
        int day = input.nextInt();

        System.out.print("Enter the year using four digits >> ");
        int year = input.nextInt();

        Local_Data ld = new Local_Data();
        LocalDate data ;
        if (month == 12){
            data = LocalDate.of(year + 1, 1, day);
        }
        else{
            data = LocalDate.of(year, month+1, day);
        };

        int remainDay = ld.lengthOfMonth(data);

        System.out.print("There are " + remainDay + " days until "+ data.getMonth() + " starts." );
        
    }
}