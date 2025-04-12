// Write your code here
// import java.LocalDate;
import java.time.LocalDate;
import java.util.Scanner;
public class TestMonthHandling{
    public static void main(String[] args){
        
        LocalDate date1 = getDate();  
        LocalDate date2 = getDate();
        System.out.print(date2);
        System.out.print(date1);
        DisplayDate(date1);
        DisplayDate(date2);

    }
    public static LocalDate getDate(){
        Scanner input = new Scanner(System.in);
        int yr, mo, da;
        System.out.println("Enter month >> " );
        mo = input.nextInt();
        System.out.println("Enter day >> " );
        da = input.nextInt();
        System.out.println("Enter year >> " );
        yr = input.nextInt();
        LocalDate data = LocalDate.of(yr, mo, da);
        return data;
    }

    public static void DisplayDate(LocalDate date){

        System.out.println("First date" + date);
        System.out.println("Second date" + (date ));
        System.out.println("Third date" + date);
        System.out.println("Fourth date" + date);

    }
}