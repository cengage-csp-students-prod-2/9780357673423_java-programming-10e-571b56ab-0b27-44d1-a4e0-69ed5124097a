// Write your code here
import java.util.Scanner;
public class PurchaseArray{
    public static void main(String[] main){
           Purchase[] purch = new Purchase[5];
           Scanner input = new Scanner(System.in);
           
           for (int i = 0; i < 5; i++){
                purch[i] = new Purchase();
                System.out.print("Enter invoice number >> ");
                int invoice = input.nextInt();
                

                while (invoice <1000 || invoice > 8000){
                    System.out.print("Enter invoice number >> ");
                    invoice = input.nextInt();
                }
                System.out.print("Enter sale amount >> ");
                double sale = input.nextDouble();
                while (sale < 0){
                    System.out.print("Enter sale amount >> ");
                    sale = input.nextDouble();
                }

                purch[i].setInvoiceNumber(invoice);
                purch[i].setSaleAmount(sale);

           }

        // Now displaying message
           System.out.println("Summary of purchase:");
           for (int i=0; i< 5; i++){
            purch[i].display();

           }
           input.close();
    }
}