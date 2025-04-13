
import java.time.*;
import java.util.Scanner;
public class TestWedding {
    public static void main(String[] args)  {
       Scanner kb = new Scanner(System.in);
       int mo, da, yr;
       String first, last, loc;
       System.out.print("Enter month of wedding ");
       mo = kb.nextInt();
       System.out.print("Enter day of wedding ");
       da = kb.nextInt();
       System.out.print("Enter year of wedding ");
       yr = kb.nextInt();
       LocalDate date = LocalDate.of(yr, mo, da);
       kb.nextLine();
       System.out.print("Enter first name of bride >> ");
       first = kb.nextLine();
       System.out.print("Enter last name of bride >> ");
       last = kb.nextLine();
       Person bride = new Person(first, last);
       System.out.print("Enter first name of groom >> ");
       first = kb.nextLine();
       System.out.print("Enter last name of groom >> ");
       last = kb.nextLine();
       Person groom = new Person(first, last);
       Couple couple = new Couple(bride, groom);
       System.out.print("Enter location of wedding >> ");
       loc = kb.nextLine(); 
       Wedding wedding = new Wedding(couple, date, loc);
       displayWeddingDetails(wedding);
    }
    public static void displayWeddingDetails(Wedding w)    {
       Couple couple = w.getCouple();
       LocalDate weddingDate = w.getWeddingDate();
       String location = w.getLocation();
       Person bride = couple.getBride();
       Person groom = couple.getGroom();
       String firstBride = bride.getFirstName();
       String lastBride = bride.getLastName();
       String firstGroom = groom.getFirstName();
       String lastGroom = groom.getLastName();
       System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
       System.out.println("Date: " + weddingDate + "   Location: " +
          location);
       System.out.println("Bride: " + firstBride +
          " " + lastBride);
       System.out.println("Groom: " + firstGroom +
          " " + lastGroom);
    }
 }
// import java.util.Scanner;
// import java.time.LocalDate;
// public class TestWedding{
    
//     public static void main(String[] args){

//         Scanner  input = new Scanner(System.in);
//         String fbride , lbride;

//         System.out.print("Enter month of wedding ");
//         int month = input.nextInt();
//         System.out.print("Enter day of wedding ");
//         int day = input.nextInt();
//         System.out.print("Enter year of wedding ");
//         int year = input.nextInt();
//         LocalDate ld = LocalDate.of(year, month, day);
//         input.nextLine();
//         System.out.print("Enter first name of the bride >> ");
//         fbride = input.nextLine() ;
//         System.out.print("Enter last name of the bride >> ");
//         lbride = input.nextLine();
//         Person bride = new Person(fbride, lbride);

//         System.out.print("Enter first name of the groom >> ");
//         String fgroom = input.nextLine();
//         System.out.print("Enter last name of the groom >> ");
//         String lgroom = input.nextLine();
//         Person groom = new Person(fgroom, lgroom);

//         Couple couple = new Couple(bride, groom);

//         System.out.print("Enter the location of wedding >> ");
//         String location = input.nextLine() ;

//         Wedding wedding = new Wedding(couple, ld , location);

//         displayWeddingDetails(wedding);
        

//     }
//     public static void displayWeddingDetails(Wedding w)    {
//         Couple couple = w.getCouple();
//         LocalDate weddingDate = w.getWeddingDate();
//         String location = w.getLocation();
//         Person bride = couple.getBride();
//         Person groom = couple.getGroom();
//         String firstBride = bride.getFirstName();
//         String lastBride = bride.getLastName();
//         String firstGroom = groom.getFirstName();
//         String lastGroom = groom.getLastName();
//         System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
//         System.out.println("Date: " + weddingDate + "   Location: " +
//            location);
//         System.out.println("Bride: " + firstBride +
//            " " + lastBride);
//         System.out.println("Groom: " + firstGroom +
//            " " + lastGroom);
//      }
//   }
