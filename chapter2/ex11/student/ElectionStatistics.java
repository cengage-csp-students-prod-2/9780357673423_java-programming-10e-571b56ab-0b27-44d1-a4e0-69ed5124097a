import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
        // Declare Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the party names and votes
        String party1, party2, party3;
        int votes1, votes2, votes3;

        // Input for first party
        System.out.print("Enter name for first party >> ");
        party1 = input.nextLine();  // Read party name
        System.out.print("Enter votes received >> ");
        votes1 = input.nextInt();  // Read votes received
        input.nextLine();  // Consume the leftover newline character

        // Input for second party
        System.out.print("Enter name for second party >> ");
        party2 = input.nextLine();  // Read party name
        System.out.print("Enter votes received >> ");
        votes2 = input.nextInt();  // Read votes received
        input.nextLine();  // Consume the leftover newline character

        // Input for third party
        System.out.print("Enter name for third party >> ");
        party3 = input.nextLine();  // Read party name
        System.out.print("Enter votes received >> ");
        votes3 = input.nextInt();  // Read votes received

        // Calculate the total votes
        int totalVotes = votes1 + votes2 + votes3;

        // Calculate the percentage of votes for each party
        double percent1 = (double) votes1 / totalVotes * 100;
        double percent2 = (double) votes2 / totalVotes * 100;
        double percent3 = (double) votes3 / totalVotes * 100;

        // Output the result for each party
        System.out.println("The " + party1 + " got " + percent1 + " percent of the vote");
        System.out.println("The " + party2 + " got " + percent2 + " percent of the vote");
        System.out.println("The " + party3 + " got " + percent3 + " percent of the vote");
    }
}
