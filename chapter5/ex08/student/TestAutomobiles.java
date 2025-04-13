import java.util.Scanner;

public class TestAutomobiles {

    public static void main(String[] args) {
        Automobile auto1 = enterData();
        Automobile auto2 = enterData();

        displayAuto(auto1);
        displayAuto(auto2);
    }

    public static Automobile enterData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID (an integer) >> ");
        int id = input.nextInt();
        input.nextLine();  // Consume newline

        System.out.print("Enter make >> ");
        String make = input.nextLine();

        System.out.print("Enter model >> ");
        String model = input.nextLine();

        System.out.print("Enter color >> ");
        String color = input.nextLine();

        System.out.print("Enter year (4 digits) >> ");
        int year = input.nextInt();

        System.out.print("Enter mpg >> ");
        double mpg = input.nextDouble();

        return new Automobile(id,   make, model, color, year, mpg);
    }

    public static void displayAuto(Automobile auto) {
        System.out.println("ID#" + auto.getId() + " " +
                auto.getMake() + " " +
                auto.getModel() + " " +
                auto.getColor() + " " +
                auto.getYear() + " " +
                auto.getMpg() + " miles per gallon");
    }
}
