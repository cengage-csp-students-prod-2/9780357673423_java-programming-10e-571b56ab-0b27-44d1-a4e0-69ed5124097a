import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of adult meals ordered >> ");
        int adultMeals = input.nextInt();

        System.out.print("Enter number of child meals ordered >> ");
        int childMeals = input.nextInt();

        double adultTotal = adultMeals * ADULT_MEAL_PRICE;
        double childTotal = childMeals * CHILD_MEAL_PRICE;
        double grandTotal = adultTotal + childTotal;

        System.out.println("\n" + adultMeals + " adult meals were ordered at $" + ADULT_MEAL_PRICE + " each.");
        System.out.println("      Total is $" + adultTotal);

        System.out.println(childMeals + " child meals were ordered at $" + CHILD_MEAL_PRICE + " each.");
        System.out.println("      Total is $" + childTotal);

        System.out.println("Grand total for all meals is $" + grandTotal);
    }
}
