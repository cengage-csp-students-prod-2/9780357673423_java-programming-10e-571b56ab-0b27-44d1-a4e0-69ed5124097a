// Write your code here
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string >> ");
        String word = input.nextLine();

        int i = 0;
        int j = word.length() - 1 ;

        while (i <= j) {

            if (word.charAt(i) != word.charAt(j)) {
                System.out.print("No, you did not enter a palindrome");
                break;
            }

        }
        System.out.print("Yes, entered a palindrome");




    }
}