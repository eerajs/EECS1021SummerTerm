import java.util.Scanner;

public class ConvertHourstoDays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println("Enter an integer for hours: ");
		int hours = input.nextInt();
		input.hasNextLine();
		
		int days = hours/24;
		int hours2 = hours%24;
		
		System.out.println(name + ", your input " + hours + " can be divided into " + days + " days and " + hours2 + " hours.");
		
		input.close();
	}

}
