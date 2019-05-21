import java.util.Scanner;

public class ComputeAndInterpretWaistToHipRatio {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println(name + ", enter your waist size in centimeters (cm): ");
		int waist = input.nextInt();
		
		System.out.println(name + ", enter your hip size in centimeters (cm): ");
		int hip = input.nextInt();
		
		double waistHipRatio = (double) waist/hip;
		
		System.out.println(name + ", your waist to hip ratio is " + waistHipRatio + ".");

		if (waistHipRatio > 1.00) {
			System.out.println("You are at high health risk!");
		}
		else if (waistHipRatio >= 0.96 && waistHipRatio <= 1.00) {
			System.out.println("You are at moderate health risk!");
		}
		else if (waistHipRatio <= 0.95) {
			System.out.println("You are at low health risk!");
		}
		
		input.close();
		
	}

}
