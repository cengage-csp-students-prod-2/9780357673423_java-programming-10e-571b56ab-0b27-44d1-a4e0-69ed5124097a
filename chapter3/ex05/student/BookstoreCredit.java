// Write your code here
import java.util.Scanner;
public class BookstoreCredit{

    public static void  main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name >> ");
        String name = input.nextLine();

        System.out.print("Enter Your Gpa >> ");
        double gpa = input.nextDouble();

        computeDiscount(name, gpa);


    }
    public static void computeDiscount(String name, double x){

        System.out.print(name + ", your GPA is " + x + ", so your credit is $" + x * 10 );
    }
}
