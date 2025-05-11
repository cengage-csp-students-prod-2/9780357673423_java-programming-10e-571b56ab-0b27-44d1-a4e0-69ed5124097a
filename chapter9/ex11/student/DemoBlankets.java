// Write your code here
import java.util.Scanner;
public class DemoBlankets{


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Data for Electric Blanket:");
        blanket.toString();
        ElectricBlanket blanket = new ElectricBlanket() ;
        blanket.toString();

        
        System.out.print("Enter material >> ");
        String mt = scan.nextLine();
        blanket.setMaterial(mt);
        blanket.toString();
        
        System.out.print("Enter size >> ");
        String sz = scan.nextLine();
        blanket.setSize(sz);
        blanket.toString();

        System.out.print("Enter size >> ");
        String cl = scan.nextLine();
        blanket.setColor(cl);
        blanket.toString();

        System.out.print("Enter number of settings >> ");
        int st = scan.nextInt();
        blanket.setSettings(st);
        blanket.toString();

        System.out.print("Does blanket have auto shutoff? Y or N >> ");
        scan.nextLine();
        String s = scan.nextLine();
        char ch = s.charAt(0);
        if (ch == ('Y')){
            blanket.setHasAutoShutoff(true);
        } 

        blanket.toString();



    
    while (true){
        System.out.print("Enter material or Q to quit >> ");
        mt = scan.nextLine();
        if (mt.equalsIgnoreCase("Q")){
            break;
        }
        blanket.setMaterial(mt);
        blanket.toString();
        
        System.out.print("Enter size >> ");
        sz = scan.nextLine();
        if (sz.equalsIgnoreCase("Q")){
            break;
        }
        blanket.setSize(sz);
        blanket.toString();

        System.out.print("Enter size >> ");
        cl = scan.nextLine();
        if (mt.equalsIgnoreCase("Q")){
            break;
        }
        blanket.setColor(cl);
        blanket.toString();

        System.out.print("Enter number of settings >> ");
        st = scan.nextInt();
        
        blanket.setSettings(st);
        blanket.toString();

        System.out.print("Does blanket have auto shutoff? Y or N >> ");
        s = scan.nextLine();
        ch = s.charAt(0);
        if (ch == ('Y')){
            blanket.setHasAutoShutoff(true);
        } 

        blanket.toString();
    }
        scan.close();
    }

}