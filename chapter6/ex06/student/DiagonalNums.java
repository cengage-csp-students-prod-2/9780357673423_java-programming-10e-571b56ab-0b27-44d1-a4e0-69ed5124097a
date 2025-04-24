// Write your code here
import java.util.Scanner;
public class DiagonalNums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single dight >> ");
        int digit = input.nextInt();
        String space = "";

        for (int i = 0; i< 10; i++){
            space = space + " ";
            System.out.println(space + digit);
        }
     }
}