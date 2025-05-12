// Write your code here
import java.util.ArrayList;
import java.util.Scanner;
public class UseGeometric{

    public static void main(String[] args){
        ArrayList[] arrayList = new ArrayList[5];
        Square[] sq = new Square[5] ;
        Triangle[] t = new Triangle[5];
        Scanner scan = new Scanner(System.in) ;
        double height;
        double width;
        String fig;

        for (int i = 0; i <5 ; i ++){
        System.out.print("Is this a (S)quare or a (T)riangle? >> ");
        fig = scan.nextLine();
        if (fig.charAt(0) == 'S'){
            System.out.print("Enter height >> ");
            height = scan.nextDouble();
            sq[i] = new Square(height , height , fig);
            

        }
        else{
            System.out.print("Enter height >> ");
            height = scan.nextDouble();
            System.out.print("Enter width >> ");
            width = scan.nextDouble();
            t[i] = new Triangle(height, width , fig);
            


        }

    }

        for (int i = 0; i <5 ; i ++){

            if (sq[i] != null) {
                sq[i].display() ;
            }
            else{
                t[i].display();
            }
            


        }





        scan.close();

    }

}