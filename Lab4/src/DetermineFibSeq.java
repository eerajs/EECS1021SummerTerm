import java.util.Arrays;
import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int value;
		boolean loop = true;
		boolean test = false;
		String cont;
		
		while (loop) {
			
			int seq = 0;
			int newValue[] = new int [20];
			
			for (int i = 0; i <= 19; i++) {
				System.out.println("Enter a positive integer value, or -1 to stop: ");
				value = input.nextInt();
				input.nextLine();
				
				if (value == -1) {
					break;
				}
				else {
					newValue[i] = value;
				}
			}
			
			for (int i = 0; i<=19; i++) {
				if (newValue[i] != 0) {
					seq++;
				}		
			}
			
			int fibSeq[] = new int [seq];
			
			for (int j = 0; j < seq; j++) {
				if (newValue[j] != 0) {
					fibSeq[j] = newValue[j];	
				}
			}
			
			for(int i = 2; i<=19;i++) {
				newValue[0] = 1;
				newValue[1] = 1;
				newValue[i] = newValue[i-1] + newValue[i-2];
			}
			
			if (seq == 1) {
				if (fibSeq[0] == 1) {
					test = true;
				}
			}
			else if(seq == 2) {
				if (fibSeq[0] == 1 && fibSeq[1] ==1) {
					test = true;
				}
			}
			else {
				for(int i = 2; i<= (seq - 1); i++) {
					if(fibSeq[0] == 1 && fibSeq[1] == 1) {
						if (fibSeq[i] == newValue[i]) {
							test = true;
						}
						else {
							test = false;
							break;
						}
					}
					else {
						test = false;
					}
				}
			}
			
			if (test == true) {
				System.out.println("The sequence you entered " + Arrays.toString(fibSeq) + " is the first " + seq + " numbers in the Fibonacci sequence.");
			}
			else if (test == false) {
				System.out.println("The sequence you entered " + Arrays.toString(fibSeq) + " is not the first " + seq + " numbers in the Fibonacci sequence.");
			}
			
			System.out.println("Would you like to try another sequence? (Y/N)");
			cont = input.nextLine();
			
			if (cont.equals("N")) {
				loop = false;
				
				System.out.println("Bye!");
			}
		}


		
		input.close();
	}
}
