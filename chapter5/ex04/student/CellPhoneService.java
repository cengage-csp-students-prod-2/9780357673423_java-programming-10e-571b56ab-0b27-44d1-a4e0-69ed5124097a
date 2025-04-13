// Write your code here
import java.util.Scanner;
public class CellPhoneService{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter talk needed >> ");
        int talk = input.nextInt();

        System.out.print("Enter text messages needed >> ");
        int text = input.nextInt();
        
        System.out.print("Enter gigabytes of data needed >> ");
        int data = input.nextInt();




        if (talk < 500 && text == 0  && data == 0){
                System.out.print("Plan A $49 per month");
        }
        else if (talk < 500 && text > 0){
            System.out.print("Plan B $55 per month");
        }
        
        else if (talk >= 500 && data == 0){
            

            
            if (text  < 100){
                System.out.print("Plan C $61 per month");
            }
            if (text >= 100){
                System.out.print("Plan D $70 per month");
            }
        
        }
        else if(data > 0){
            if (data < 3){
                System.out.print("Plan E $79 per month");
            }
            else if(data >=3){
                System.out.print("Plan F $87 per month");
            }
        }
        
        
    } 
}