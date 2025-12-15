package task1;
import java.util.Random;
import java.util.Scanner;

public class guessGame {

	public static void main(String[] args) {
		
	
				   Scanner input = new Scanner(System.in);
			        Random rand = new Random();

			        int totalScore = 0;
			        String play;

			        System.out.println("Welcome to Number Guessing Game");

			        do {
			            int number = rand.nextInt(100) + 1;
			            int attempts = 0;
			            int maxTry = 7;
			            boolean win = false;

			            System.out.println("\nI have selected a number between 1 and 100");
			            System.out.println("You have only " + maxTry + " chances");

			            while (attempts < maxTry) {
			                System.out.print("Enter your guess: ");
			                int guess = input.nextInt();
			                attempts++;

			                if (guess == number) {
			                    System.out.println("Correct! You guessed the number");
			                    win = true;

			                    int score = (maxTry - attempts + 1) * 10;
			                    totalScore = totalScore + score;

			                    System.out.println("Score for this round: " + score);
			                    break;
			                } 
			                else if (guess > number) {
			                    System.out.println("Your guess is too high");
			                } 
			                else {
			                    System.out.println("Your guess is too low");
			                }

			                System.out.println("Remaining attempts: " + (maxTry - attempts));
			            }

			            if (!win) {
			                System.out.println("Game Over! Correct number was: " + number);
			            }

			            System.out.println("Total Score: " + totalScore);
			            System.out.print("Do you want to play again? (yes/no): ");
			            play = input.next();

			        } while (play.equalsIgnoreCase("yes"));

			        System.out.println("Thanks for playing!");
			        input.close();
				
			}
			

		

	
	}


