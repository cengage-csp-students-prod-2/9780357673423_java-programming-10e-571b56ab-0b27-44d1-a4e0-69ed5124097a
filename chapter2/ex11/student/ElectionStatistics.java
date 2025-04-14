import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n1, n2, n3;
        int p1, p2, p3;

        System.out.print("Enter name for first party >> ");
        n1 = input.nextLine();
        System.out.print("Enter votes received >> ");
        p1 = input.nextInt();
        input.nextLine(); // consume the leftover newline

        System.out.print("Enter name for second party >> ");
        n2 = input.nextLine();
        System.out.print("Enter votes received >> ");
        p2 = input.nextInt();
        input.nextLine(); // consume the leftover newline

        System.out.print("Enter name for third party >> ");
        n3 = input.nextLine();
        System.out.print("Enter votes received >> ");
        p3 = input.nextInt();

        int totalVotes = p1 + p2 + p3;

        double r1 = (p1 * 100.0) / totalVotes;
        double r2 = (p2 * 100.0) / totalVotes;
        double r3 = (p3 * 100.0) / totalVotes;

        System.out.println("\nThe " + n1 + " got " + r1 + " percent of the vote");
        System.out.println("The " + n2 + " got " + r2 + " percent of the vote");
        System.out.println("The " + n3 + " got " + r3 + " percent of the vote");
    }
}
