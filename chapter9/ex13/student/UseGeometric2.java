import java.util.Scanner;

public class UseGeometric2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GeometricFigure2[] figures = new GeometricFigure2[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Is this a (S)quare or a (T)riangle? >> ");
            String type = scan.nextLine().trim().toUpperCase();
            if (type.equals("S")) {
                System.out.print("Enter height >> ");
                double h = scan.nextDouble();
                scan.nextLine(); // consume newline
                figures[i] = new Square2(h);
            } else if (type.equals("T")) {
                System.out.print("Enter height >> ");
                double h = scan.nextDouble();
                System.out.print("Enter width >> ");
                double w = scan.nextDouble();
                scan.nextLine(); // consume newline
                figures[i] = new Triangle2(h, w);
            } else {
                System.out.println("Invalid input. Skipping.");
                i--; // retry
                continue;
            }
        }

        for (GeometricFigure2 g : figures) {
            System.out.println("The " + g.getFigure() +
                " with height = " + g.getHeight() +
                " and with width = " + g.getWidth() +
                " has an area of " + g.figureArea());
        }

        scan.close();
    }
}
