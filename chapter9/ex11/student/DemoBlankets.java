
import java.util.*;
public class DemoBlankets {
   public static void main(String[] args) {
      Blanket b = new Blanket();
      Scanner kb = new Scanner(System.in);
      String material, size, color, auto;
      int settings;
      final String QUIT = "Q";
      System.out.println("Data for Blanket:");
      System.out.println(b.toString());
      System.out.print("Enter material >> ");
      material = kb.nextLine();
      while(!material.equals(QUIT)) {
  
         b.setMaterial(material);
         System.out.println(b.toString());
         System.out.print("Enter size >> ");
         size = kb.nextLine();
         b.setSize(size);
         System.out.println(b.toString());
         System.out.print("Enter color >> ");
         color = kb.nextLine();
         b.setColor(color);
         System.out.println(b.toString());
         System.out.print("Enter material or " + QUIT + " to quit >> ");
         material = kb.nextLine();
      }


    }}
// import java.util.Scanner;
// public class DemoBlankets{


//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);

//         System.out.println("Data for Electric Blanket:");
//         ElectricBlanket blanket = new ElectricBlanket() ;
//         System.out.println(blanket.toString());
        

        
//         System.out.print("Enter material >> ");
//         String mt = scan.nextLine();
//         blanket.setMaterial(mt);
//         System.out.println(blanket.toString());

        
//         System.out.print("Enter size >> ");
//         String sz = scan.nextLine();
//         blanket.setSize(sz);
//                 System.out.println(blanket.toString());


//         System.out.print("Enter size >> ");
//         String cl = scan.nextLine();
//         blanket.setColor(cl);
//                 System.out.println(blanket.toString());


//         System.out.print("Enter number of settings >> ");
//         int st = scan.nextInt();
//         blanket.setSettings(st);
//                 System.out.println(blanket.toString());


//         System.out.print("Does blanket have auto shutoff? Y or N >> ");
//         scan.nextLine();
//         String s = scan.nextLine();
//         char ch = s.charAt(0);
//         if (ch == ('Y')){
//             blanket.setHasAutoShutoff(true);
//         } 

//                 System.out.println(blanket.toString());




    
//     while (true){
//         System.out.print("Enter material or Q to quit >> ");
//         mt = scan.nextLine();
//         if (mt.equalsIgnoreCase("Q")){
//             break;
//         }
//         blanket.setMaterial(mt);
//                 System.out.println(blanket.toString());

        
//         System.out.print("Enter size >> ");
//         sz = scan.nextLine();
//         if (sz.equalsIgnoreCase("Q")){
//             break;
//         }
//         blanket.setSize(sz);
//                 System.out.println(blanket.toString());


//         System.out.print("Enter size >> ");
//         cl = scan.nextLine();
//         if (mt.equalsIgnoreCase("Q")){
//             break;
//         }
//         blanket.setColor(cl);
//                 System.out.println(blanket.toString());


//         System.out.print("Enter number of settings >> ");
//         st = scan.nextInt();
        
//         blanket.setSettings(st);
//                 System.out.println(blanket.toString());


//         System.out.print("Does blanket have auto shutoff? Y or N >> ");
//         s = scan.nextLine();
//         ch = s.charAt(0);
//         if (ch == ('Y')){
//             blanket.setHasAutoShutoff(true);
//         } 

//                 System.out.println(blanket.toString());

//     }
//         scan.close();
//     }

// }