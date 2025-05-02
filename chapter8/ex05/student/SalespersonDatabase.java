// Write your code here
import java.util.Scanner;
public class SalespersonDatabase{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Salesperson arr[] = new Salesperson[20];

        do{
        System.out.print("Do you want to (A)dd, (D)elete, or (C)hange a record or (Q)uit >> ");

        if (ch.equalsIgnoreCase("A")){
            System.out.print("Enter salesperson ID >> ");
            int id = input.nextInt();
            System.out.print("Enter sales >> ");
            double sales = input.nextDouble();
            int l = arr.length;
            arr[l+1] = new Salesperson(id,sales);

            System.out.println("Current database:");
            for (int i = 0; i < arr.length ; i ++){
                System.out.println("ID #" + arr[i].getId() + " $" + arr[i].getSales());
            }

        }
        else if (ch.equalsIgnoreCase("D")){
            System.out.print("Enter salesperson ID >> ");
            int id = input.nextInt();
            System.out.print("Enter sales >> ");
            double sales = input.nextDouble();
            int l = arr.length;
            arr[l+1] = new Salesperson(id,sales);

            System.out.println("Current database:");
            for (int i = 0; i < arr.length ; i ++){
                System.out.println("ID #" + arr[i].getId() + " $" + arr[i].getSales());
            }

        }

        
    } while(ch.equalsIgnoreCase("q")); 

}
}