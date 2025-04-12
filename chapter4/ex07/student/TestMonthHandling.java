import java.time.LocalDate;
import java.util.Scanner;

public class TestMonthHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get two dates from user input
        LocalDate date1 = getDate(input);
        LocalDate date2 = getDate(input);

        // Display results for each date
        displayDate(date1);
        displayDate(date2);

        input.close();
    }

    // Method to get a date from the user
    public static LocalDate getDate(Scanner input) {
        System.out.print("Enter month >> ");
        int month = input.nextInt();
        System.out.print("Enter day >> ");
        int day = input.nextInt();
        System.out.print("Enter year >> ");
        int year = input.nextInt();

        return LocalDate.of(year, month, day);
    }

    // Method to display the original date and the next three months
    public static void displayDate(LocalDate date) {
        System.out.println("First date " + date);
        System.out.println("Second date " + date.plusMonths(1));
        System.out.println("Third date " + date.plusMonths(2));
        System.out.println("Fourth date " + date.plusMonths(3));
    }
}
