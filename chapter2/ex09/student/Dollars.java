// Write your code here
import java.util.Scanner;
public class Dollars{

    public static void main(String[] args){
        int twenty , ten,  five, one;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of dollars ");
        int num = input.nextInt();
        
        System.out.print("$"+ num + " converted is " );
        if ((num / 20)>0){
            twenty = num / 20;
            ten = (num - (twenty *20) )/ 10;
            five = (num - (twenty * 20)-(ten * 10)) / 5;
            one = (num - (twenty * 20)-(ten * 10) - (five * 5)) / 1;
            System.out.print(twenty + " $" + 20 +"s, " + ten + " $" + 10 +"s, " + five + " $" + 5 +"s, and " +  one + " $" + 1 +"s"  );
        }
        else if ((num/10) > 0){
            ten = (num  / 10);
            five = (num - (ten * 10)) / 5;
            one = (num - (ten * 10) - (five * 5)) / 1;
            System.out.print( ten + " $" + 10 +"s," + five + " $" + 5 +"s, and " +  one + " $" + 1 +"s"  );
        }else if ((num/5) > 0){
            five = num   / 5;
            one = (num - (five * 5)) / 1;
            System.out.print(  five + " $" + 5 +"s, and " +  one + " $" + 1 +"s"  );
        }else{
            System.out.print(  num + " $" + 1 +"s"  );
        }





    }

}