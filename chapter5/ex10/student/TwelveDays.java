import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        int choice = getChoice();
        String suffix;

        // Determine the correct suffix for the day
        if (choice == 1) {
            suffix = "st";
        } else if (choice == 2) {
            suffix = "nd";
        } else if (choice == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        System.out.println("\nOn the " + choice + suffix + " day of Christmas");
        System.out.println("My true love gave to me");

        switch (choice) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves and");
            case 1:
                System.out.println("A partridge in a pear tree");
                break;
            default:
                System.out.println("Invalid day. Please enter a number from 1 to 12.");
        }
    }

    public static int getChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("From what day do you want to start\nthe song The Twelve Days of Christmas? >> ");
        int choice = input.nextInt();
        return choice;
    }
}
