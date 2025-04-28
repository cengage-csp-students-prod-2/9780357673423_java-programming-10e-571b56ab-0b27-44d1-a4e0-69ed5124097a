import java.util.Scanner;

public class PrepareTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ssn;
        do {
            System.out.print("Enter your Social Security number >> ");
            ssn = input.nextLine();
        } while (!ssn.matches("\\d{3}-\\d{2}-\\d{4}"));

        System.out.print("Enter your first name >> ");
        String fname = input.nextLine();

        System.out.print("Enter your last name >> ");
        String lname = input.nextLine();

        System.out.print("Enter your address >> ");
        String address = input.nextLine();

        System.out.print("Enter your city >> ");
        String city = input.nextLine();

        System.out.print("Enter your state >> ");
        String state = input.nextLine();

        String zip;
        do {
            System.out.print("Enter your zip code >> ");
            zip = input.nextLine();
        } while (!zip.matches("\\d{5}"));

        String maritalStatus;
        do {
            System.out.print("Enter marital status >> ");
            maritalStatus = input.nextLine();
        } while (!(maritalStatus.startsWith("S") || maritalStatus.startsWith("s") || maritalStatus.startsWith("M") || maritalStatus.startsWith("m")));

        double income;
        do {
            System.out.print("Enter your annual income >> ");
            income = input.nextDouble();
        } while (income < 0);

        TaxReturn taxReturn = new TaxReturn(ssn, fname, lname, address, city, state, zip, income, maritalStatus);

        taxReturn.display();

        input.close();
    }
}
