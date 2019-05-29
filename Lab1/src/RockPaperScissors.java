import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		// Sets the Scanner
		Scanner input = new Scanner(System.in);
				
		// Sets the starting score to 0
		int player1Score = 0;
		int player2Score = 0;

		// Prompts the user to enter player names
		System.out.println("Enter name of player 1: ");
		String player1 = input.nextLine();
				
		System.out.println("Enter name of player 2: ");
		String player2 = input.nextLine();
				
		// The First Round
		System.out.println("==================");
		System.out.println("Round 1: ");
		System.out.println("==================");

		// Asks the players their move
		System.out.println("What does " + player1 + " play? (R, P, or S): ");
		String player1Move = input.nextLine();

		System.out.println("What does " + player2 + " play? (R, P, or S): ");
		String player2Move = input.nextLine();
				
		if (player1Move.equals("R") && player2Move.equals("S")) { // If player 1 wins the round a point is added
			player1Score += 1;
			player2Score += 0;
		}
		else if (player1Move.equals("S") && player2Move.equals("P")) { // If player 1 wins the round a point is added
			player1Score += 1;
			player2Score += 0;
		}
		else if (player1Move.equals("P") && player2Move.equals("R")) { // If player 1 wins the round a point is added
			player1Score += 1;
			player2Score += 0;
		}
		else if (player1Move.equals("R") && player2Move.equals("R")) { // If its a tie no point is added
			player1Score += 0;
			player2Score += 0;
		}
		else if (player1Move.equals("S") && player2Move.equals("S")) { // If its a tie no point is added
			player1Score += 0;
			player2Score += 0;
		}
		else if (player1Move.equals("P") && player2Move.equals("P")) { // If its a tie no point is added
			player1Score += 0;
			player2Score += 0;
		}
		else { // If player 2 wins the round a point is added
			player1Score += 0;
			player2Score += 1;
				}
				
		// The Second Round
		System.out.println("==================");
		System.out.println("Round 2: ");
		System.out.println("==================");
				
		// Same As Above (But for Round 2)
		System.out.println("What does " + player1 + " play? (R, P, or S): "); 
		String player1Move2 = input.nextLine();

		System.out.println("What does " + player2 + " play? (R, P, or S): ");
		String player2Move2 = input.nextLine();
				
		if (player1Move2.equals("R") && player2Move2.equals("S")) {
			player1Score += 1;
			player2Score += 0;
		}
		else if (player1Move2.equals("S") && player2Move2.equals("P")) {
			player1Score += 1;
			player2Score += 0;
		}
		else if (player1Move2.equals("P") && player2Move2.equals("R")) {
			player1Score += 1;
			player2Score += 0;
		}
		else if (player1Move2.equals("R") && player2Move2.equals("R")) {
			player1Score += 0;
			player2Score += 0;
		}
		else if (player1Move2.equals("S") && player2Move2.equals("S")) {
			player1Score += 0;
			player2Score += 0;
		}
		else if (player1Move2.equals("P") && player2Move2.equals("P")) {
			player1Score += 0;
			player2Score += 0;
		}
		else {
			player1Score += 0;
			player2Score += 1;
		}
		
		// Prompts the 3rd Round if there's a tie in Round 1 and Round 2
		if (player1Score == player2Score) {
					
			// Same As Above (But for Round 3)
			System.out.println("==================");
			System.out.println("Round 3: ");
			System.out.println("==================");
					
			System.out.println("What does " + player1 + " play? (R, P, or S): ");
			String player1Move3 = input.nextLine();

			System.out.println("What does " + player2 + " play? (R, P, or S): ");
			String player2Move3 = input.nextLine();
					
			if (player1Move3.equals("R") && player2Move3.equals("S")) {
				player1Score += 1;
				player2Score += 0;
			}
			else if (player1Move3.equals("S") && player2Move3.equals("P")) {
				player1Score += 1;
				player2Score += 0;
			}
			else if (player1Move3.equals("P") && player2Move3.equals("R")) {
				player1Score += 1;
				player2Score += 0;
			}
			else if (player1Move3.equals("R") && player2Move3.equals("R")) {
				player1Score += 0;
				player2Score += 0;
			}
			else if (player1Move3.equals("S") && player2Move3.equals("S")) {
				player1Score += 0;
				player2Score += 0;
			}
			else if (player1Move3.equals("P") && player2Move3.equals("P")) {
				player1Score += 0;
				player2Score += 0;
			}
			else {
				player1Score += 0;
				player2Score += 1;
			}	
		}
		
		// Based on the score the winner is chosen and the results are displayed
		if (player1Score > player2Score) {
			System.out.println("Game Over: " + player1 + " wins!");
		}
		else if (player2Score > player1Score) {
			System.out.println("Game Over: " + player2 + " wins!");
		}
		else if (player2Score == player1Score){
			System.out.println(player1 + " what is 3x3?");
			int answer1 = input.nextInt();
						
			System.out.println(player2 + " what is 3x3?");
			int answer2 = input.nextInt();
						
			if (answer1 == 9) {
				System.out.println("Game Over: " + player1 + " wins!");
			}
			else if (answer2 == 9) {
				System.out.println("Game Over: " + player2 + " wins!");
			}
			else {
				System.out.println("Game Over: It's A Tie!");
			}
		}
				
		// Closes the Scanner
		input.close(); 
	}
}