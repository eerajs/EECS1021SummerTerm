import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {

		// Sets the scanner
		Scanner input = new Scanner(System.in);
		
		// Sets the initial bound number (lower bound)
		int bound = 1;
		
		// Asks the user to enter the lower bound
		System.out.println("Enter the lower bound: ");
		int lowBound = input.nextInt(); // Stores lower bound value
		input.nextLine();
		
		// Asks the user to enter the upper bound
		System.out.println("Enter the upper bound: ");
		int uppBound = input.nextInt(); // Stores upper bound value
		input.nextLine();

		// Checks if the lower bound is greater than or equal to upper bound, if yes error message is displayed
		if (lowBound > uppBound || lowBound == uppBound) {
			System.out.println("Error: lower bound " + lowBound + " is not less than or equal to the upper bound " + uppBound + ".");
			System.out.println("Bye!");
		} 
		else { // If no error then the numbers in the bound are displayed
			System.out.println("Numbers between " + lowBound + " and " + uppBound + ":");
			
			for (bound = lowBound; bound <= uppBound; bound++) {
				System.out.println(bound);
			}
			
			System.out.println("Bye!");
		}
		
		// Closes the scanner
		input.close();
	}

}
