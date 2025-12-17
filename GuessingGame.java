import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 100
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        // Loop until the user guesses correctly
        while (userGuess != numberToGuess) {

            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } 
            else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("🎉 Correct! You guessed the number.");
                System.out.println("Number of attempts: " + attempts);
            }
        }

        sc.close();
    }
}
