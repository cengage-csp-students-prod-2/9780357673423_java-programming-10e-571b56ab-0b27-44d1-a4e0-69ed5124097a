// Write your code here
// import java.LocalDate;
import java.time.LocalDate;
import java.util.Scanner;
public class TestMonthHandling{
    public static void main(String[] args){
        
        LocalDate date1 = getDate();  
        LocalDate date2 = getDate();
        
        DisplayDate(date1);
        DisplayDate(date2);

    }
    public static LocalDate getDate(){
        Scanner input = new Scanner(System.in);
        int yr, mo, da;
        System.out.print("Enter month >> " );
        mo = input.nextInt();
        System.out.print("Enter day >> " );
        da = input.nextInt();
        System.out.print("Enter year >> " );
        yr = input.nextInt();
        LocalDate data = LocalDate.of(yr, mo, da);
        return data;
    }

    public static void DisplayDate(LocalDate date){

        System.out.println("First date " + date);
        System.out.println("Second date " +  date.plusMonths(1) );
        System.out.println("Third date " + date.plusMonths(2) );
        System.out.println("Fourth date " +  date.plusMonths(3) );

    }
}