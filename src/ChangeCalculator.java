import java.util.Scanner;

public class ChangeCalculator {

    public static void main(String[] args) {
        // This application calculates the minimum number of quarters, dimes, nickles, pennies
        // needed for the specified number of cents
        // Assume that the user will enter a valid integer value between 0 and 99 for the number of cents
        // The application should continue only if the user enters y or Y to continue

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to the Change Calculator");

        // perform calculation until user's choice isn't y or Y
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            // get user's input data
            System.out.println("Enter number of cents: ");
            int cents = sc.nextInt();

            int quarter = cents / 25; //calculate number of quarters
            cents = cents % 25; // assign remainder to cents variable

            int dime = cents / 10; //calculate number of dimes
            cents = cents % 10; //assign remainder to cents variable

            int nickle = cents / 5; // calculate number of nickles

            int penny = cents % 5; //assign remainder from nickle calculation to penney

            // display results
            System.out.println("Number of change in Quarters: " + quarter);
            System.out.println("Number of change in Dimes: " + dime);
            System.out.println("Number of change in Nickles: " + nickle);
            System.out.println("Number of change in Pennies: " + penny);

            // ask if user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        sc.close();
    }

}
