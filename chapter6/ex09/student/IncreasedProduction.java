// Write your code here
import java.util.Scanner;
public class IncreasedProduction{
    public static void main(String[] args){

        Scanner  input = new Scanner(System.in);

        System.out.print("Enter worker's current production level >> ");
        double prod = input.nextDouble();
        int res = 0;
        for (int i = 1; i<=24 ; i++){
            prod = (prod  + prod * 0.06);
            System.out.println("Month " + i + "     Predicted production is "+  prod);
            if (prod >= 10000) {
                res = i;
            }
        }
        if (prod >= 10000) {
            System.out.println("The month in which production exceeds 10000.0 is month " + res );
        }
        else{
            System.out.println("This worker will not reach 10000.0 in 24 months");

        }
        
        input.close();
    }
}