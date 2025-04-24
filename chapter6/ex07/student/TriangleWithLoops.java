// Write your code here


import java.util.Scanner;
public class TriangleWithLoops{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number >> ");
        int digit = input.nextInt();
        int a = 1;
        for (int i = 7; i >= 0 ; i--){
            for (int j = 0; j < i; j++ ){
                System.out.print(" ");
            }
            for (int k = 0; k < a ; k++ ){
                System.out.print(digit);
            }

            System.out.print("\n");

            a = a + 2;
        }
    }
}