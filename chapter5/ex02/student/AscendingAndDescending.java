// Write your code here
import java.util.Scanner;
public class AscendingAndDescending{
    public static void main(String[] main){

        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer... ");
        a = input.nextInt();
        System.out.print("And another... ");
        b = input.nextInt();
        System.out.print("And just one more... ");
        c = input.nextInt();

        

        if (a < b) 


        if (a < b) {
            if (b < c){ 
                System.out.println("Ascending: " + a + b + c);
                System.out.println("descending: " + c+ b+ a);
                   
            }
            else if (b > c){ 
                System.out.println("Ascending: " + a +  c+ b);
                System.out.println("descending: " + b + c+ a);
                   
            }
        }
        else if (b< a){
            if (a<c){
                System.out.println("Ascending: " +  b + a + c);
                System.out.println("descending: " + c + a + b);
            }
            else if (c < a){
                System.out.println("Ascending: " +  b + c + a);
                System.out.println("descending: " + a + c + b);
            }
        }
        else if (c < a ){
            if (a<b){
                System.out.println("Ascending: " +  c + a + b);
                System.out.println("descending: " + b + a + c);
            }
            else if (b < a){
                System.out.println("Ascending: " +  c + b + a);
                System.out.println("descending: " + a + b + c);
            }
        }

    }   
}