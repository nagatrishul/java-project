import java.util.Scanner;

public class ValidationModule {

    public double handleRainyMonth(Scanner sc, double totalExpenses) {

        System.out.print("Is it Rainy Month? (true/false): ");
        boolean rainy = sc.nextBoolean();

        if (rainy) {
            System.out.print("Enter Extra Water Cost: ");
            double water = sc.nextDouble();

            System.out.print("Enter Repair Cost: ");
            double repair = sc.nextDouble();

            totalExpenses += (water + repair);
        }

        return totalExpenses;
    }

    public void validateExpenses(double income, double totalExpenses) {

        if (totalExpenses > income) {
            System.out.println("Warning: Expenses exceed Income!");
        }
    }
}