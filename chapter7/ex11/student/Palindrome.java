// Write your code here
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string >> ");
        String word = input.nextLine();

        int i = 0;
        int j = word.length() ;
        int loop = j / 2;

        while (i <= loop ) {

            if (word.charAt(i) != word.charAt(j-1)) {
                System.out.print("No, you did not enter a palindrome");
                break;
            }
             i = i + 1;
             j = j - 1;

        }
        if (i >= loop){
        System.out.print("Yes, entered a palindrome");
        }



    }
}