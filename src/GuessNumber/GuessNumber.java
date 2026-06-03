package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char playAgain;

        System.out.println("🎯 Welcome to the Number Guessing Game!");

        do {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int guess = 0;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("Can you guess it?");

            while (guess != secretNumber) {

                System.out.print("Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("❌ Invalid input! Please enter a number.");
                    scanner.next();
                    continue;
                }

                guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too Low! Try Again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too High! Try Again.");
                } else {
                    System.out.println("\n🎉 Congratulations!");
                    System.out.println("You guessed the correct number: " + secretNumber);
                    System.out.println("Total Attempts: " + attempts);
                }
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nThank you for playing!");
        scanner.close();
    }
}
