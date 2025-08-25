import java.util.Scanner;
import java.util.Random;

public class MyProgram
{
    public static void main(String[] args)
    { 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(25) + 1; // 1 to 25
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 25.");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 25) {
                System.out.println("Please guess a number between 1 and 25.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " tries.");
                break;
            }
        }

        scanner.close();
    }
}