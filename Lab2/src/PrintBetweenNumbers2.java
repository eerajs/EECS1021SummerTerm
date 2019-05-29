import java.util.Scanner;

public class PrintBetweenNumbers2 {

	public static void main(String[] args) {

		// Sets the scanner
		Scanner input = new Scanner(System.in);
		
		// Sets the initial bound number (lower bound)
		int bound = 1;
		
		// Initializes and runs the program until loop = false
		boolean loop = true;
		
		// Runs the program until loop == 0
		while (loop) {
			
			// Asks the user to enter the lower bound
			System.out.println("Enter the lower bound: ");
			int lowBound = input.nextInt(); // Stores lower bound value
			input.nextLine();
			
			// Asks the user to enter the upper bound
			System.out.println("Enter the upper bound: ");
			int uppBound = input.nextInt(); // Stores upper bound value
			input.nextLine();
			
			// If lower bound is less than upper bound then the bound is displayed
			if (lowBound < uppBound) {
				System.out.println("Numbers between " + lowBound + " and " + uppBound + ":");
				
				for (bound = lowBound; bound <= uppBound; bound++) {
					System.out.println(bound);
				}
			}
			// Checks if the lower bound is greater than or equal to upper bound, if yes error message is displayed
			else if (lowBound > uppBound || lowBound == uppBound) { 
				System.out.println("Error: lower bound " + lowBound + " is not less than or equal to the upper bound " + uppBound + ".");
			}
			
			// Asks the user if they would continue printing the bound
			System.out.println("Would you like to continue printing? (Y/N)");
			String ans = input.nextLine(); // Stores the reply
			
			// If reply is Yes then loop = true
			if (ans.equals("Y") || ans.equals("y")) {
				loop = true;
			}
			// Else loop = false and the program ends
			else if (ans.equals("N") || ans.equals("n")) {
				loop = false;
				System.out.println("Bye!");
			}
		}
		
		// Closes the scanner
		input.close();
	}

}
