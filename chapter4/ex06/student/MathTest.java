// Write your code here
// import Math;
import java.util.Scanner;
public class MathTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        double val = input.nextDouble();

        System.out.println(Math.sqrt(num));

        System.out.println("The sine of 300: " + Math.sin(val));
        System.out.println("The cosine of 300: " + Math.sin(val));
        
        System.out.println("The floor, ceiling and rounded value of " + val + " : " + Math.floor(val) + Math.ceil(val) + Math.round(val));



    }
}

// public class Math{
//     public squareroot(int val){
//         return (val * val);
//     }

//     public trignometric(val)
    
// }