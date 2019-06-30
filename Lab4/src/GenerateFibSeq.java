import java.util.Arrays;
import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int fibSize = 1;
		boolean loop = true;
		String cont;
		
		while (loop) {
			
			System.out.println("Enter the size of Fibonacci Sequence: ");
			fibSize = input.nextInt();
			input.nextLine();
			
			if (fibSize <= 0) {
				System.out.println("Error: Fibonacci Sequence must have size >= 1.");
			}
			else if (fibSize == 1) {
				System.out.println("Fibonacci Sequence of size 1:");
				System.out.println("<1>");
			}
			else if (fibSize == 2) {
				System.out.println("Fibonacci Sequence of size 2:");
				System.out.println("<1,1>");
			}
			else if (fibSize > 2) {
				int fibSeq[] = new int [fibSize];
				
				fibSeq[0] = 1;
				fibSeq[1] = 1;
				
				for (int i = 2; i <= (fibSize - 1); i ++) {
					fibSeq[i] = fibSeq[i - 2] + fibSeq[i - 1];
					
				}
				
				System.out.println("Fibonacci Sequence of size " + fibSize + ":");
				System.out.println(Arrays.toString(fibSeq));
			}
			
			System.out.println("Would you like to continue? (Y/N)");
			cont = input.nextLine();
			
			if (cont.equals("Y")) {
				loop = true;
				fibSize = 1;
			}
			else if (cont.equals("N")) {
				loop = false;
				System.out.println("Bye!");
				break;
			}
		}
		
		input.close();
	}
}
