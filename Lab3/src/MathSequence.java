import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String loop = "Y";
		
		while(loop.equals("Y")) {
			System.out.println("What kind of processing task would you like to perform?");
			System.out.println("1: Generate an arithmetic sequence.");
			System.out.println("2: Generate a geometric sequence.");
			System.out.println("3: Determine an arithmetic sequence.");
		
			int taskType = input.nextInt();
			
			while(!(taskType > 0 && taskType < 4)) {
				System.out.println("Error: Task number must be 1, 2, or 3.");
				System.out.println("What kind of processing task would you like to perform?");
				System.out.println("1: Generate an arithmetic sequence.");
				System.out.println("2: Generate a geometric sequence.");
				System.out.println("3: Determine an arithmetic sequence.");
				
				taskType = input.nextInt();
			}
			
			if(taskType == 1) {
				System.out.println("Enter the first term in the arithmetic sequence: ");
				int term1 = input.nextInt();
				System.out.println("Enter the common difference in the arithmetic sequence: ");
				int diff = input.nextInt();
				System.out.println("Enter the number of terms in the arithmetic sequence: ");
				int terms = input.nextInt();
				int[] arith = new int[terms];
				
				int sum = 0;
				System.out.print("<");
				for(int i = 0; i < arith.length; i++) {
					arith[i] = term1 + (i*diff);
					sum+= term1 + (i*diff);
					if(i == arith.length-1) {
						System.out.print(arith[i]);
					}
					else {
						System.out.print(arith[i] +", ");
					}
				}
				System.out.println(">");
				System.out.println("Sum of the arithmetic sequence: " + sum);
				input.nextLine();
			}
			else if(taskType == 2) {
				System.out.println("Enter the first term in the geometric sequence: ");
				int term1 = input.nextInt();
				System.out.println("Enter the common ratio in the geometric sequence: ");
				int ratio = input.nextInt();
				System.out.println("Enter the number of terms in the geometric sequence: ");
				int terms = input.nextInt();
				int[] geo = new int[terms];
				
				int sum = 0;
				System.out.print("<");
				for(int i = 0; i < geo.length; i++) {
					geo[i] = term1 * (int)(Math.pow(ratio, i));
					sum+= term1 * (int) (Math.pow(ratio, i));
					if(i == geo.length-1) {
						System.out.print(geo[i]);
					}
					else {
						System.out.print(geo[i] +", ");
					}
				}
				System.out.println(">");
				System.out.println("Sum of the geometric sequence: " + sum);				
				input.nextLine();

			}
			else if(taskType == 3) {
				
				int[] seq = new int[10];
				
				int counter = 0;
				String loop2 = "Y";

				while(loop2.equals("Y") && counter < seq.length) {
					System.out.println("Enter a new number: ");
					int num = input.nextInt();
					seq[counter] = num;
					
					
					if(counter == 9) {
						System.out.println("You have entered maximum number of numbers!");
						input.nextLine();
					}
					else {
						System.out.println("You have entered " + (counter+1) + " numbers.");
						System.out.println("You may still enter another " + (seq.length-counter-1) + " numbers");
					
						System.out.println("Would you like to enter another number? (Y/N)");
						input.nextLine();
						loop2 = input.nextLine();
					}
					
					if(loop2.equals("N") && counter < 1) {
						System.out.println("Error: We cannot infer the common difference from a sequence of size one.");
					}
					
					counter++;
				}
				int[] arith = new int[counter];
				for(int i = 0; i < counter; i++) {
					arith[i] = seq[i];
				}
				
				if(!(counter < 2)) {
					boolean arithSeq = true;
					int sum = 0;
					System.out.println("We will start processing your sequence.");
					
					for(int i = arith.length-2; i > 0; i--) {
						arithSeq = arith[i+1]-arith[i] == arith[i] - arith[i-1];						
					}
					
					System.out.print("<");
					for(int i = 0; i < arith.length; i++) {
						if(i==arith.length-1) {
							System.out.print(arith[i]);
						}else {
							System.out.print(arith[i] + ", ");
						}
						sum += arith[i];						
					}
					if(arithSeq) {
						int d = arith[arith.length-1] - arith[arith.length-2];
						System.out.println("> is an arithmetic sequence with");
						System.out.println("first term " + arith[0] + ", common difference " + 
							d + ", length " + arith.length + ", and sum " + sum);
					}
					else {
						System.out.println("> is not an arithmetic sequence");
					}
				}
			}

			System.out.println("Would you like to process another sequence? (Y/N)");
			loop = input.nextLine();
		}
		
		System.out.println("Bye!");
		input.close();
	}
}
