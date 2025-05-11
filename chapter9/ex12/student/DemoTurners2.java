import java.util.Scanner;
public class DemoTurners2{

    public static void main(String[] args){


        for (int i = 0 ; i < 2 ; i ++){
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
}