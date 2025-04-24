
// Write your code here
import java.util.Scanner;
public class QuizScoreStatistics{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score ");
        int digit = input.nextInt();

        int high = 0;
        int low = digit;
        int valid = 1;
        double total = 0;

        while (digit != 99){
            System.out.print("Enter another score or 99 to quit >> ");
            digit = input.nextInt();
            if (digit == 99){
                break;
            }
            if (digit > high){
                high = digit;
            }

            if (digit < low){
                low = digit;
            }
            if (digit >= 0 && digit <= 10){
                valid = valid + 1;
            }
            total = total + digit;



        }
        System.out.println(valid + " valid scores were entered");
        System.out.println("Highest was " + high);
        System.out.println("Lowest was " + low);
        System.out.println("Average was " + total / valid);

    }
}