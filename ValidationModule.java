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
        } else {
            System.out.println("Expenses are within Income.");
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Total Basic Expenses: ");
        double totalExpenses = sc.nextDouble();

        // Creating object
        ValidationModule vm = new ValidationModule();

        // Handling Rainy Month
        totalExpenses = vm.handleRainyMonth(sc, totalExpenses);

        // Validating Expenses
        vm.validateExpenses(income, totalExpenses);

        System.out.println("Final Total Expenses: " + totalExpenses);

        sc.close();
    }
}