import java.util.Scanner;
public class DemoTurners2{

    public static void main(String[] args){


        
        Scanner scan = new Scanner(System.in);

        System.out.print("Do you want to create a (L)eaf, a (P)age, a pan(C)ake, a lo(V)e or c(O)llege  >> ");
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

        else if (ch == 'O'){
            College c = new College();
            c.turn();

        }
        else if (ch == 'V'){
            Love V = new Love();
            V.turn();

        }
        scan.close();
    }
    }


