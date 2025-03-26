// Write your code here
import java.util.Scanner;

class Eggs{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // Initiate input variable to get input from user
        System.out.print("Enter the count of eggs >> "); 
        int x = input.nextInt(); // It will take integer as input in x


        // int x = null;

        int no_of_dozen = x / 12; // calculate the no of dozen from the x
        
        double ans = no_of_dozen * 3.25; // calculat the amount needed to get the no of dozen * 3.25

        int no_of_extras = x % 12; // calculate the no of extra eggs from the

        double extra_ans = no_of_extras * 0.45;  // calculat the amount needed to get the no of extras * 0.45

        System.out.printf("You ordered %d eggs. That’s %d dozen at $3.25 per dozen and %d loose eggs at 45 cents each for a total of $%f. ", x, no_of_dozen, no_of_extras, ans+ extra_ans);


    }
}