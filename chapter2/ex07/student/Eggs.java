// Write your code here
import java.util.Scanner;

class Eggs{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the count of eggs >> ");
        int x = input.nextInt();

        // int x = null;

        int no_of_dozen = x / 12;
        
        double ans = no_of_dozen * 3.25;

        int no_of_extras = x % 12;

        double extra_ans = no_of_extras * 0.45;

        System.out.printf("You ordered %d eggs. That’s %d dozen at $3.25 per dozen and %d loose eggs at 45 cents each for a total of $%f. ", x, no_of_dozen, no_of_extras, ans+ extra_ans);


    }
}