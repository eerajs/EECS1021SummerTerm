import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println(name + ", what is your score for the Premilimany Lab (Lab0): ");
		int lab0 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab 1: ");
		int lab1 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab 2: ");
		int lab2 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab 3: ");
		int lab3 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab 4: ");
		int lab4 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab 5: ");
		int lab5 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab 6: ");
		int lab6 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab test 1: ");
		int labTest1 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for Lab test 2: ");
		int labTest2 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for the Midterm: ");
		int midterm = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", what is your score for the Final: ");
		int finalExam = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", which course are you talking about? ");
		String course = input.nextLine();
		
		int preLab = (int) (lab0*0.02);
		int labs = (int) (((lab1 + lab2 + lab3 + lab4 + lab5 + lab6)/6)*0.18);
		int labTests = (int) (((labTest1 + labTest2)/2)*0.30);
		int midtermMark = (int) (midterm*0.15);
		int finalMark = (int) (finalExam*0.35);
		int finalPercentage = preLab + labs + labTests + midtermMark + finalMark;
		
		System.out.println(" ");
		System.out.println(name + ", here is your grade report for " + course + ":");
		System.out.println("-------------------------------");
		System.out.println("Lab 0: " + lab0);
		System.out.println("-------------------------------");
		System.out.println("Lab 1: " + lab1);
		System.out.println("Lab 2: " + lab2);
		System.out.println("Lab 3: " + lab3);
		System.out.println("Lab 4: " + lab4);
		System.out.println("Lab 5: " + lab5);
		System.out.println("Lab 6: " + lab6);
		System.out.println("-------------------------------");
		System.out.println("Lab Test 1: " + labTest1);
		System.out.println("Lab Test 2: " + labTest2);
		System.out.println("-------------------------------");
		System.out.println("Midterm: " + midterm);
		System.out.println("-------------------------------");
		System.out.println("Final: " + finalExam);
		System.out.println("-------------------------------");
		System.out.println("Final Percentage: " + finalPercentage);

		input.close();
	}

}
