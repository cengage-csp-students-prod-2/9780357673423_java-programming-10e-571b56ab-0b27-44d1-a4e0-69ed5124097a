// Write your code here
import java.util.Scanner;
public class SalespersonSort{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
        
        Salesperson[] arr = new Salesperson[7];
        int id;
        double sales;
        for (int i = 0; i < 7 ; i++){
            
            System.out.print("Enter a ID number >> ");
            id = input.nextInt();
            System.out.print("Enter a sales value >> ");
            sales = input.nextDouble();
            arr[i] = new Salesperson(id, sales);
        }

        System.out.print("... \n By which field do you want to sort? \n(I)d number or (S)ales >> ");
        input.nextLine();
        String ch = input.nextLine();


        Salesperson tp;
        if  (ch.equalsIgnoreCase("I") ) {
        for (int i = 0; i < 7; i++){
            for (int j = i + 1 ; j < 7 ; j ++){

                if (arr[i].getId() > arr[j].getId()) {

                    tp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tp;

                }

            }
            System.out.println("ID " + arr[i].getId() + " sales: " + arr[i].getSales());

        }
    }
    else if (ch.equalsIgnoreCase("S")) {
        for (int i = 0; i < 7; i++){
            for (int j = i + 1 ; j < 7 ; j ++){

                if (arr[i].getSales() > arr[j].getSales()) {

                    tp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tp;

                }

            }
            System.out.println("ID " + arr[i].getId() + " sales: " + arr[i].getSales());
        }



    }
    }
}
