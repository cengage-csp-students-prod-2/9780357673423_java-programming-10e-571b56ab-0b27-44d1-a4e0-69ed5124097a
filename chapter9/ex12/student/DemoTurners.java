// Write your code here
import java.util.Scanner;
public class DemoTurners{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Do you want to create a (L)eaf, a (P)ageor a pan(C)ake >> ");
        char ch = scan.nextLine().charAt(0);

        if (ch == 'L'){
            Leaf leaf = new Leaf();
            leaf.turn();
        }
        else if (ch == 'P'){
            Page page = new Page();
            page.turn();
        }
        else if (ch == 'C'){
            Pancake p = new Pancake();
            p.turn();

        }

    }
}