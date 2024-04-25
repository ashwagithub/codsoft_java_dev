import java.util.Scanner;
import java.util.Random;

/*
 * TASK 1:Number Game
 */
 
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        int totalAttempts = 0;
        int roundsWon = 0;
        boolean playAgain = true;
        
        while (playAgain) {
            int attempts = 0;
            int targetNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
            
            System.out.println("\nNew Round!");
            
            while (attempts < 10) {
                System.out.print("Guess the number between 1 and 100 (Attempts left: " + (10 - attempts) + "): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + attempts + " attempts!");
                    totalAttempts += attempts;
                    roundsWon++;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
            
            if (attempts == 10) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
                totalAttempts += 10;
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.startsWith("y");
        }
        
        System.out.println("\nGame Over!");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total attempts: " + totalAttempts);
        
        scanner.close();
    }
}
