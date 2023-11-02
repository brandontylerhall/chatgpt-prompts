package numberCheck;

import util.Input;

import java.util.Random;

// Challenge: Create a program that simulates a simple number guessing game.
// The computer will generate a random number between 1 and 100, and the user has to guess the number.
// The program should provide hints to the user, indicating whether the guessed number is too high, too low, or correct.
// The game should continue until the user correctly guesses the number.
// After each guess, the program should also display the number of attempts the user has made.
public class NumberGame {
    public static void main(String[] args) {
        Input in = new Input();
        Random random = new Random();

        int ans = random.nextInt(51);
        boolean gotIt = false;
        int attempts = 0;

        do {
            System.out.println("Guess a number between 0 and 50: ");
            int userInput = in.getInt();

            if (userInput < ans) {
                attempts++;
                System.out.println("Nuh uh, it's a bit higher! Try again: ");
                System.out.printf("You have tried this many times: %d%n", attempts);
            } else if (userInput > ans) {
                attempts++;
                System.out.println("Nuh uh, it's a bit lower! Try again: ");
                System.out.printf("You have tried this many times: %d%n", attempts);
            } else {
                gotIt = true;
                attempts++;
                System.out.printf("Golly gee, you guessed it! You did so in %d attempts!", attempts);
            }
        } while (!gotIt);

    }
}
