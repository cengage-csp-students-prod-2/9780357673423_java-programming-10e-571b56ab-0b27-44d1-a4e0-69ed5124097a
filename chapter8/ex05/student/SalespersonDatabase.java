// Write your code here
import java.util.Scanner;
public class SalespersonDatabase{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Salesperson[] arr = new Salesperson[20];
        String ch;
        int count = 0;

        do{
        System.out.print("Do you want to (A)dd, (D)elete, or (C)hange a record or (Q)uit >> ");
        ch = input.nextLine();


        if (ch.equalsIgnoreCase("A")){
            if (count >= 20){
                System.out.print("Array limit exceeded");
                continue;
            }

            System.out.print("Enter salesperson ID >> ");
            int id = input.nextInt();
            boolean exist = false;

            for (int i = 0; i < count; i++){
                if (arr[i].getId() == id){
                    System.out.print("ID already exist.");
                    exist = true;
                    break;
                }
                count++;          
        }
        if (!exist){
            System.out.print("Enter sales >> ");
            double sales = input.nextDouble();
            arr[count] = new Salesperson(id,sales);
            count++;
            
        }
        }


    
        else if (ch.equalsIgnoreCase("D")){
            if (count == 0){
                System.out.print("Array is empty");
            }

            System.out.print("Enter ID to change >> ");
            int id = input.nextInt();
            
            boolean exist = false;

            for (int i = 0; i < count; i++){
                if (arr[i].getId() == id){
                    exist = true;

                    for (int j = i; j < count; j++){
                        arr[j] = arr[j+1];
                    }
                    arr[count-1] = null;
                    count--;
                    break;
                }
                

            }
            if (!exist){
                System.out.print("ID does not exist");

            }


        }

        else if (ch.equalsIgnoreCase("C")){
            if (count == 0){
                System.out.print("Array is empty");
                continue;
            }
            System.out.print("Enter salesperson ID >> ");
            int id = input.nextInt();
            boolean exist = false;

            for (int i = 0; i < count; i++){
                if (arr[i].getId() == id){
                    System.out.print("Enter sales >> ");
                    double sales = input.nextDouble();
                    arr[i].setSales(sales);
                    exist =  true;

                    break;
                }
            }

            if (!exist){
                System.out.print("ID does not exist");

            }

        }

        for (int i =0 ; i < count; i++){
            for (int j = i; j < count; j ++){
                if ( arr[i].getId() > arr[j].getId() ) { 
                Salesperson sp = arr[i];
                arr[i] = arr[j] ;
                arr[j] = sp;
            }
        }
        }

            
            
            System.out.println("Current database:");
            for (int i = 0; i < count ; i ++){
                System.out.println("ID #" + arr[i].getId() + " $" + arr[i].getSales());
            }            
    } while(!ch.equalsIgnoreCase("Q"));




    }
}


