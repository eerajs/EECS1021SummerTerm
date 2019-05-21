import java.util.Scanner;

public class ComputePerimeterAndAreaOfRectangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for height: ");
		int height = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter an integer for width: ");
		int width = input.nextInt();
		input.nextLine();
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		int perimeter = (2*height)+(2*width);
		int area = height*width;
		
		System.out.println(name + ", your input rectangle with height " + height + " and width " + width + " has perimeter " + perimeter + " and area " + area + ".");
		
		input.close();
		
	}

}
