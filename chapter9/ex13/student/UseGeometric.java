// Write your code here
import java.util.ArrayList;
import java.util.Scanner;
public class UseGeometric{

    public static void main(String[] args){
        ArrayList[] arrayList = new ArrayList(5);
        Scanner scan = new Scanner(System.in) ;
        double height;
        double width;
        String fig;

        for (int i = 0; i <5 ; i ++){
        System.out.print("Is this a (S)quare or a (T)riangle? >> ");
        fig = scan.nextLine();
        if (fig.charAt(0) == 'S'){

            height = scan.nextDouble();
            Square sq = new Square(height , height , fig);
            arrayList[i] = sq;

        }
        else{
            height = scan.nextDouble();
            width = scan.nextDouble();
            Triangle t = new Triangle(height, width , fig);
            arrayList[i] = t;


        }

    }

        for (int i = 0; i <5 ; i ++){

            (arrayList[i]).display() ;


        }





        scan.close();

    }

}