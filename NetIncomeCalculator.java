import java.util.Scanner;

public class NetIncomeCalculator {
    public static void main(String[] args) {
        double earnings = getEarnings();
        double expenses = getExpenses();
        double profit = getProfit(earnings, expenses);

        // Print to console 
        System.out.printf("Net income: $%.2f\n", profit);
    }

    // Output the earned amounts to console using formatted strings
    public static double getEarnings() {
         // Create variables representing earned amounts for each item sold
         double earnedBubblegum = 202;
         double earnedToffee = 118;
         double earnedIceCream = 2250;
         double earnedChocolate = 1680;
         double earnedDoughnut = 1075;
         double earnedPancake = 80;
         double totalEarnings = earnedBubblegum + earnedToffee + earnedIceCream + earnedChocolate + earnedDoughnut + earnedPancake;

        // Output earnings to console
        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%.2f\n", earnedBubblegum);
        System.out.printf("Toffee: $%.2f\n", earnedToffee);
        System.out.printf("Ice cream: $%.2f\n", earnedIceCream);
        System.out.printf("Milk chocolate: $%.2f\n", earnedChocolate);
        System.out.printf("Doughnut: $%.2f\n", earnedDoughnut);
        System.out.printf("Pancake: $%.2f\n", earnedPancake);
        System.out.printf("Income: $%.2f\n", totalEarnings);
        
        return totalEarnings;
    }


    public static double getExpenses() {
        // Accept user input for expenses  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses: ");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses: ");
        double otherExpenses = scanner.nextDouble(); 
        double totalExpenses = staffExpenses + otherExpenses;
        scanner.close();
        return totalExpenses;
    }

    public static double getProfit(double earnings, double expenses) {
        return earnings - expenses;
    }
}
