import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int value;
		boolean loop;
		String cont;
		
		while (loop = true) {
	
			System.out.println("What is the value of: ");
			value = input.nextInt();

			if (value == 1) {
				System.out.println("Value is Correct");
			}
			else if (value == 0) {
				System.out.println("Value is Incorrect");
			}
			
			
			System.out.println("Would u like to continue: Y/N");
			cont = input.nextLine();
			
			if (cont.equals("Y")) {
				loop = true;
			}
			else if (cont.equals("N")) {
				loop = false;
			}
		}
		
	}

}
