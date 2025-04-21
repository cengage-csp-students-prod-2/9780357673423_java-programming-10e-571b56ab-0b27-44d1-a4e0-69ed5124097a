// Write your code here
import java.util.Scanner;
public class Perfect{
    public static void main(String[] args) {
        // int start = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a maximum number >> ");
        int end = input.nextInt();
        int total = 0;
        for (int start = 1; start<= end; start ++ ){
            
            for (int st = 1 ; st < start; st ++){
            if ( start % st == 0){
                total += st;
            }
        }
        if (total == start){
        System.out.println("The number " + total + " is perfect");
        }
        total = 0;
        }



    }
}