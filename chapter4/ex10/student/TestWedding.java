
import java.util.Scanner;
import java.time.LocalDate;
public class TestWedding{
    
    public static void main(String[] args){

        Scanner  input = new Scanner(System.in);

        System.out.print("Enter month of wedding ");
        int month = input.nextInt();
        System.out.print("Enter day of wedding ");
        int day = input.nextInt();
        System.out.print("Enter year of wedding ");
        int year = input.nextInt();
        LocalDate ld = LocalDate.of(year, month, day);

        System.out.print("Enter first name of the bride >> ");
        String fbride = input.nextLine();
        System.out.print("Enter last name of the bride >> ");
        String lbride = input.nextLine();
        Person bride = new Person(fbride, lbride);

        System.out.print("Enter first name of the groom >> ");
        String fgroom = input.nextLine();
        System.out.print("Enter last name of the groom >> ");
        String lgroom = input.nextLine();
        Person groom = new Person(fgroom, lgroom);

        Couple couple = new Couple(bride, groom);

        System.out.print("Enter the location of wedding >> ");
        String location = input.nextLine() ;

        Wedding wedding = new Wedding(couple, ld , location);

        displayWeddingDetails(wedding);
        input.close();

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
