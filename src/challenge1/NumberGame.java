package challenge1;

import util.Input;

import java.util.Random;

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
