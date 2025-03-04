package week2;

import java.util.Random;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // 1-100

        int guess = intInput("Guess the number");

        while (guess != secretNumber) {
            System.out.println("Number Incorrect try again");

            if (guess > secretNumber) {
                System.out.println("Guess lower");
            }

            if (guess < secretNumber) {

            System.out.println("Guess higher");

            }
            guess = intInput("Guess the number");
        }

        System.out.println("You have been guessed correctly");
    }
}
