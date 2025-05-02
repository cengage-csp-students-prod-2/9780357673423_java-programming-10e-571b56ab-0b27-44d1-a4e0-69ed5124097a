// Write your code here
import java.util.Scanner;
public class SalespersonDatabase{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Salesperson arr[] = new Salesperson[20];
        String ch;

        do{
        System.out.print("Do you want to (A)dd, (D)elete, or (C)hange a record or (Q)uit >> ");
        ch = nextLine();

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
            System.out.print("Enter ID to change >> ");
            int id = input.nextInt();
            
            

            System.out.println("Current database:");
            for (int i = 0; i < arr.length ; i ++){
                if (arr[i].getId() == id ){
                    continue;
                }
                System.out.println("ID #" + arr[i].getId() + " $" + arr[i].getSales());
            }

        }

        else if (ch.equalsIgnoreCase("C")){
            System.out.print("Enter salesperson ID >> ");
            int id = input.nextInt();
            System.out.print("Enter sales >> ");
            double sales = input.nextDouble();
            
            System.out.println("Current database:");
            for (int i = 0; i < arr.length ; i ++){
                if (arr[i].getId() == id ){
                    arr[i].setSales(sales);
                }
                System.out.println("ID #" + arr[i].getId() + " $" + arr[i].getSales());
            }

        }

        
    } while(ch.equalsIgnoreCase("q")); 

}
}